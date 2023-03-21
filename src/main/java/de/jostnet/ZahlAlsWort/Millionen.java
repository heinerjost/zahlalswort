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

public class Millionen
{
	public static String get(Zahl zahl)
	{
		String millionen = "";
		if (zahl.getMillionenStellen() == 1)
		{
			millionen = "einemillion";
		}
		else
		{
			millionen = ZahlAlsWort.get(new Zahl(zahl.getMillionenStellen()))
					+ "millionen";
		}

		millionen += Tausender.get(zahl);

		return millionen;
	}
}
