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

public class Zehner
{
	public static String get(Zahl zahl)
	{
		if (zahl.getZehnerStelle() == 0 && zahl.getEinerStelle() == 0)
		{
			return "";
		}
		switch (zahl.getZehner())
		{
			case 10:
				return "zehn";
			case 11:
				return "elf";
			case 12:
				return "zwölf";
			case 13:
				return "dreizehn";
			case 14:
				return "vierzehn";
			case 15:
				return "fünfzehn";
			case 16:
				return "sechzehn";
			case 17:
				return "siebzehn";
			case 18:
				return "achtzehn";
			case 19:
				return "neunzehn";
			default:
				return zwanzigbisneunundneunzig(zahl);
		}
	}

	private static String zwanzigbisneunundneunzig(Zahl zahl)
	{
		String einer = "";
		if (zahl.getEinerStelle() == 1)
		{
			einer = "einund";
		}
		else if (zahl.getEinerStelle() > 1)
		{
			einer = Einer.get(new Zahl(zahl.getEinerStelle())) + "und";
		}
		String zehner = "";
		if (zahl.getZehnerStelle() == 2)
		{
			zehner = "zwanzig";
		}
		if (zahl.getZehnerStelle() > 2)
		{
			zehner = Einer.get(new Zahl(zahl.getZehnerStelle()));
			if (zahl.getZehnerStelle() == 3)
			{
				zehner += "ßig";
			}
			else
			{
				zehner += "zig";
			}
		}
		return einer + zehner;
	}
}
