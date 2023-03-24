package de.jostnet.ZahlAlsWort;

/**********************************************************************
 * Copyright (c) by Heiner Jostkleigrewe
 * 
 * heiner@jost-net.de
 **********************************************************************/

class Hunderter
{
	static String get(Zahl zahl)
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
