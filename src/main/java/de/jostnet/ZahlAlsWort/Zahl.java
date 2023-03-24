package de.jostnet.ZahlAlsWort;

/**********************************************************************
 * Copyright (c) by Heiner Jostkleigrewe
 * 
 * heiner@jost-net.de
 **********************************************************************/

class Zahl
{
	private int zahl;

	private String zahlenstring;

	Zahl(int zahl)
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
