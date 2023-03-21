package de.jostnet.ZahlAlsWort;
/**********************************************************************
 * Copyright (c) by Heiner Jostkleigrewe
 * This program is free software: you can redistribute it and/or modify it under the terms of the 
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,  but WITHOUT ANY WARRANTY; without 
 *  even the implied warranty of  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See 
 *  the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program.  If not, 
 * see <http://www.gnu.org/licenses/>.
 * 
 * heiner@jost-net.de
 **********************************************************************/



public class Einer
{
	public static String get(Zahl zahl)
	{
		switch (zahl.getEinerStelle())
		{
			case 0:
				return "null";
			case 1:
				return "eins";
			case 2:
				return "zwei";
			case 3:
				return "drei";
			case 4:
				return "vier";
			case 5:
				return "fünf";
			case 6:
				return "sechs";
			case 7:
				return "sieben";
			case 8:
				return "acht";
			case 9:
				return "neun";
		}
		return "ungültige Zahl:" + zahl;
	}
}
