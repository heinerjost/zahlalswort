package de.jostnet.ZahlAlsWort;

/**********************************************************************
 * Copyright (c) by Heiner Jostkleigrewe
 * 
 * heiner@jost-net.de
 **********************************************************************/

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ZahlTest
{
	@Test
	void einer()
	{
		Zahl zahl = new Zahl(1);
		assertEquals(1, zahl.getEinerStelle());
	}

	@Test
	void einerAusZehner()
	{
		Zahl zahl = new Zahl(12);
		assertEquals(2, zahl.getEinerStelle());
	}

	@Test
	void einerAusHunderter()
	{
		Zahl zahl = new Zahl(123);
		assertEquals(3, zahl.getEinerStelle());
	}

	@Test
	void zehner()
	{
		Zahl zahl = new Zahl(20);
		assertEquals(2, zahl.getZehnerStelle());
	}

	@Test
	void zehnerAusHunderter()
	{
		Zahl zahl = new Zahl(220);
		assertEquals(2, zahl.getZehnerStelle());
	}

	@Test
	void hunderter()
	{
		Zahl zahl = new Zahl(300);
		assertEquals(3, zahl.getHunderterStelle());
	}

	@Test
	void hunderterAusTausender()
	{
		Zahl zahl = new Zahl(3400);
		assertEquals(4, zahl.getHunderterStelle());
	}

	@Test
	void tausenderstellen1()
	{
		Zahl zahl = new Zahl(1000);
		assertEquals(1, zahl.getTausenderStellen());
	}

	@Test
	void tausenderstellen2()
	{
		Zahl zahl = new Zahl(22111);
		assertEquals(22, zahl.getTausenderStellen());
	}

	@Test
	void tausenderstellen3()
	{
		Zahl zahl = new Zahl(333111);
		assertEquals(333, zahl.getTausenderStellen());
	}

	@Test
	void tausenderstellen4()
	{
		Zahl zahl = new Zahl(1444000);
		assertEquals(444, zahl.getTausenderStellen());
	}

	@Test
	void millionenstellen1()
	{
		Zahl zahl = new Zahl(1222333);
		assertEquals(1, zahl.getMillionenStellen());
	}

	@Test
	void millionenstellen2()
	{
		Zahl zahl = new Zahl(11222333);
		assertEquals(11, zahl.getMillionenStellen());
	}

	@Test
	void millionenstellen3()
	{
		Zahl zahl = new Zahl(111222333);
		assertEquals(111, zahl.getMillionenStellen());
	}

}
