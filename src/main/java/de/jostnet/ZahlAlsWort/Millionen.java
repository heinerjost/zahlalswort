package de.jostnet.ZahlAlsWort;
/**********************************************************************
 * Copyright (c) by Heiner Jostkleigrewe
 * 
 * heiner@jost-net.de
 **********************************************************************/

class Millionen
{
	static String get(Zahl zahl)
	{
		String millionen = "";
		if (zahl.getMillionenStellen() == 1)
		{
			millionen = "eine Million ";
		}
		else
		{
			millionen = ZahlAlsWort.get(new Zahl(zahl.getMillionenStellen()))
					+ " Millionen ";
		}

		millionen += Tausender.get(zahl);

		return millionen;
	}
}
