package de.jostnet.ZahlAlsWort;

/**********************************************************************
 * Copyright (c) by Heiner Jostkleigrewe
 * This program is free software: you can redistribute it and/or modify it under the terms of the 
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,  but WITHOUT ANY WARRANTY; without 
 *  even the implied warranty of  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See 
 *  the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program.  If not, 
 * see <http://www.gnu.org/licenses/>.
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
