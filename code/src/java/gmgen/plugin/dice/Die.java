/*
 *  Initiative - A role playing utility to track turns
 *  Copyright (C) 2002 Devon D Jones
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 *  Die.java
 *
 *  Created on January 24, 2002, 11:15 AM
 */
package gmgen.plugin.dice;

import java.util.Random;

/**
 * Abstract class describing a die of any kind
 */
public abstract class Die
{

	private DiceConfig dc;

	/** Random number seed */
	protected static final Random rand = new Random();

	protected Die(final DiceConfig dc) {
		this.dc = dc;
	}

	/** Name of the die in the nds+m format
	 * @return Name of the die
	 */
	public String toString()
	{
		return dc.toFormula();
	}
}
