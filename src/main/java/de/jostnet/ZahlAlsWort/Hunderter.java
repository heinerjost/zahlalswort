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

public class Hunderter
{
	public static String get(Zahl zahl)
	{
		String hunderter = "";
		if (zahl.getHunderterStelle() == 0)
		{
			hunderter = "";
		}
		else if (zahl.getHunderterStelle() == 1)
		{
			hunderter = "ein";
		}
		else
		{
			hunderter = Einer.get(new Zahl(zahl.getHunderterStelle()));
		}
		if (hunderter.length() > 0)
		{
			hunderter += "hundert";
		}

		if (zahl.getZehnerStelle() == 0 && zahl.getEinerStelle() > 0)
		{
			hunderter += Einer.get(zahl);
		}
		else
		{
			hunderter += Zehner.get(zahl);
		}

		return hunderter;
	}
}
