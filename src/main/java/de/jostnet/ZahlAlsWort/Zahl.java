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

public class Zahl
{
	private int zahl;

	private String zahlenstring;

	public Zahl(int zahl)
	{
		this.zahl = zahl;
		this.zahlenstring = zahl + "";
	}

	public int getZahl()
	{
		return zahl;
	}

	public boolean isEiner()
	{
		return zahlenstring.length() == 1;
	}

	public boolean isZehner()
	{
		return zahlenstring.length() == 2;
	}

	public boolean isHunderter()
	{
		return zahlenstring.length() == 3;
	}

	public boolean isTausender()
	{
		return zahlenstring.length() >= 4 && zahlenstring.length() <= 6;
	}

	public boolean isMillionen()
	{
		return zahlenstring.length() >= 7 && zahlenstring.length() <= 9;
	}


	public boolean isMillion()
	{
		return zahlenstring.length() == 7;
	}

	public int getEinerStelle()
	{
		String einer = zahlenstring.substring(zahlenstring.length() - 1,
				zahlenstring.length());
		return Integer.valueOf(einer);
	}

	public int getZehnerStelle()
	{
		String zehner = zahlenstring.substring(zahlenstring.length() - 2,
				zahlenstring.length() - 1);
		return Integer.valueOf(zehner);
	}

	public int getZehner()
	{
		String zehner = zahlenstring.substring(zahlenstring.length() - 2,
				zahlenstring.length());
		return Integer.valueOf(zehner);
	}

	public int getHunderterStelle()
	{
		String hunderter = zahlenstring.substring(zahlenstring.length() - 3,
				zahlenstring.length() - 2);
		return Integer.valueOf(hunderter);
	}

	public int getTausenderStelle()
	{
		String tausender = zahlenstring.substring(zahlenstring.length() - 4,
				zahlenstring.length() - 3);
		return Integer.valueOf(tausender);
	}

	public int getTausenderStellen()
	{
		String stellen = "";
		if (zahlenstring.length() >= 4)
		{
			stellen = zahlenstring.substring(0, zahlenstring.length() - 3);
			if (stellen.length() > 3)
			{
				stellen = stellen.substring(stellen.length() - 3);
			}
		}
		return Integer.valueOf(stellen);
	}

	public int getMillionenStellen()
	{
		String stellen = "";
		if (zahlenstring.length() >= 7)
		{
			stellen = zahlenstring.substring(0, zahlenstring.length() - 6);
			if (stellen.length() > 6)
			{
				stellen = stellen.substring(stellen.length() - 6);
			}
		}
		return Integer.valueOf(stellen);
	}

}
