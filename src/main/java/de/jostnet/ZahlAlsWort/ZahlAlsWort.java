package de.jostnet.ZahlAlsWort;

import java.math.BigDecimal;

/**********************************************************************
 * ZahlAlsWort - Java library for translating numbers to words in German with
 * German rules. Java Bibliothek zur Übersetzung von Zahlen zu Wortes in Deutsch
 * mit deutschen Regeln
 * 
 * Copyright (c) by Heiner Jostkleigrewe
 * 
 * @author heiner@jost-net.de
 * @version 1.0.0
 **********************************************************************/

public class ZahlAlsWort
{

	/**
	 * Konvertierung eines int-Wertes in ein Wort
	 * 
	 * @param zahl
	 * @return wort
	 */

	public static String get(int zahl)
	{
		Zahl z = new Zahl(zahl);
		String ret = "";
		if (z.isEiner())
		{
			return Einer.get(z);
		}
		if (z.isZehner())
		{
			return Zehner.get(z);
		}
		if (z.isHunderter())
		{
			return Hunderter.get(z);
		}
		if (z.isTausender())
		{
			return Tausender.get(z);
		}
		if (z.isMillionen())
		{
			ret += Millionen.get(z);
		}
		return ret;
	}

	/**
	 * Konvertierung eines BigDecimal-Wertes in ein Wort
	 * 
	 * @param zahl die umgewandelt werden soll
	 * @return
	 */
	public static String get(BigDecimal zahl)
	{
		return get(zahl.intValue());
	}

	/**
	 * Konvertierung eines Double-Wertes in ein Wort
	 * 
	 * @param zahl
	 * @return die umgewandelt werden soll
	 */
	public static String get(Double zahl)
	{
		return get(zahl.intValue());
	}

	/**
	 * Konvertierung eines Float-Wertes in ein Wort
	 * 
	 * @param zahl die umgewandelt werden soll
	 * @return
	 */
	public static String get(Float zahl)
	{
		return get(zahl.intValue());
	}

	static String get(Zahl zahl)
	{
		return get(zahl.getZahl());
	}

}
