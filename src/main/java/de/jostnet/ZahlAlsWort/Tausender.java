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
		String tausenderstring = "";
		int tausender = zahl.getZahl() / 1_000;
		if (tausender == 1)
		{
			tausenderstring = "ein";
		}
		else
		{
			tausenderstring = ZahlAlsWort.get(new Zahl(tausender));
		}
		tausenderstring += "tausend";

		int rest = zahl.getZahl() - tausender * 1_000;
		if (rest > 0)
		{
			tausenderstring += ZahlAlsWort.get(new Zahl(rest));
		}
		return tausenderstring;
	}
}
