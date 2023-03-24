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
