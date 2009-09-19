/*
 * Copyright (c) Thomas Parker, 2009.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA
 */
package pcgen.cdom.facet;

import pcgen.cdom.enumeration.CharID;
import pcgen.cdom.enumeration.IntegerKey;
import pcgen.core.Globals;
import pcgen.core.PCTemplate;

/**
 * NonProficiencyPenaltyFacet is a Facet that calcualtes the Non-Proficiency
 * Penalty assessed when a Player Character is not proficient with a Weapon (and
 * attempts to use that Weapon)
 */
public class NonProficiencyPenaltyFacet
{
	private TemplateFacet templateFacet = FacetLibrary
			.getFacet(TemplateFacet.class);

	/**
	 * Returns the Non-Proficiency Penalty assessed when a Player Character
	 * represented by the given CharID is not proficient with a Weapon (and
	 * attempts to use that Weapon)
	 * 
	 * @param id
	 *            The CharID representing the Player Character for which a
	 *            Non-Proficiency Penalty will be calculated
	 * @return The Non-Proficiency Penalty assessed when a Player Character
	 *         represented by the given CharID is not proficient with a Weapon
	 */
	public int getPenalty(CharID id)
	{
		int npp = Globals.getGameModeNonProfPenalty();

		for (PCTemplate t : templateFacet.getSet(id))
		{
			Integer temp = t.get(IntegerKey.NONPP);
			if (temp != null)
			{
				npp = temp;
			}
		}

		return npp;
	}

}
