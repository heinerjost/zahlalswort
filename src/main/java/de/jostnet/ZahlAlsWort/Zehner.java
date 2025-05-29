package de.jostnet.ZahlAlsWort;

/**********************************************************************
 * Copyright (c) by Heiner Jostkleigrewe
 * 
 * heiner@jost-net.de
 **********************************************************************/

class Zehner
{
	static String get(Zahl zahl)
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
			case 60:
				return "sechzig";
			case 70:
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
		if (zahl.getZehnerStelle() == 6)
		{
			zehner = "sechzig";
		}
		else if (zahl.getZehnerStelle() == 7)
		{
			zehner = "siebzig";
		}
		if (zahl.getZehnerStelle() > 2 && zahl.getZehnerStelle() != 6
				&& zahl.getZehnerStelle() != 7)
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
