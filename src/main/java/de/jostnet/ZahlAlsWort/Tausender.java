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

public class Tausender
{
	public static String get(Zahl zahl)
	{
		String tausender = "";
		if (zahl.getTausenderStelle() == 1)
		{
			tausender = "ein";
		}
		else
		{
			tausender = ZahlAlsWort.get(new Zahl(zahl.getTausenderStellen()));
		}
		tausender += "tausend";

		tausender += Hunderter.get(zahl);

		return tausender;
	}
}
