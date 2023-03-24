package de.jostnet.ZahlAlsWort;

/**********************************************************************
 * Copyright (c) by Heiner Jostkleigrewe
 * 
 * heiner@jost-net.de
 **********************************************************************/

class Tausender
{
	static String get(Zahl zahl)
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
