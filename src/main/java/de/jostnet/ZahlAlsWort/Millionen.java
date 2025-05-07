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
		String millionenstring = "";
		int millionen = zahl.getZahl() / 1_000_000;
		if (millionen == 1)
		{
			millionenstring = "eine Million ";
		}
		else
		{
			millionenstring = ZahlAlsWort.get(new Zahl(millionen))
					+ " Millionen ";
		}
		int rest = zahl.getZahl() - millionen * 1_000_000;
		if (rest > 0)
		{
			millionenstring += ZahlAlsWort.get(new Zahl(rest));
		}
		return millionenstring;
	}
}
