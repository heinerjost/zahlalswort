package de.jostnet.ZahlAlsWort;

/**********************************************************************
 * Copyright (c) by Heiner Jostkleigrewe
 * 
 * heiner@jost-net.de
 **********************************************************************/

class Einer
{
	static String get(Zahl zahl)
	{
		switch (zahl.getEinerStelle())
		{
			case 0:
				return "null";
			case 1:
				return "eins";
			case 2:
				return "zwei";
			case 3:
				return "drei";
			case 4:
				return "vier";
			case 5:
				return "fünf";
			case 6:
				return "sechs";
			case 7:
				return "sieben";
			case 8:
				return "acht";
			case 9:
				return "neun";
		}
		return "ungültige Zahl:" + zahl;
	}
}
