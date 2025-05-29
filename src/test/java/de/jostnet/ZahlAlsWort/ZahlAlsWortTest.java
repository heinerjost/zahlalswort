package de.jostnet.ZahlAlsWort;

/**********************************************************************
 * Copyright (c) by Heiner Jostkleigrewe
 * 
 * heiner@jost-net.de
 **********************************************************************/

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class ZahlAlsWortTest
{
	@Test
	void null0()
	{
		assertEquals("null", ZahlAlsWort.get(0));
	}

	@Test
	void eins()
	{
		assertEquals("eins", ZahlAlsWort.get(1));
	}

	@Test
	void zwei()
	{
		assertEquals("zwei", ZahlAlsWort.get(2));
	}

	@Test
	void drei()
	{
		assertEquals("drei", ZahlAlsWort.get(3));
	}

	@Test
	void vier()
	{
		assertEquals("vier", ZahlAlsWort.get(4));
	}

	@Test
	void fuenf()
	{
		assertEquals("fünf", ZahlAlsWort.get(5));
	}

	@Test
	void sechs()
	{
		assertEquals("sechs", ZahlAlsWort.get(6));
	}

	@Test
	void sieben()
	{
		assertEquals("sieben", ZahlAlsWort.get(7));
	}

	@Test
	void acht()
	{
		assertEquals("acht", ZahlAlsWort.get(8));
	}

	@Test
	void neun()
	{
		assertEquals("neun", ZahlAlsWort.get(9));
	}

	@Test
	void zehn()
	{
		assertEquals("zehn", ZahlAlsWort.get(10));
	}

	@Test
	void elf()
	{
		assertEquals("elf", ZahlAlsWort.get(11));
	}

	@Test
	void zwoelf()
	{
		assertEquals("zwölf", ZahlAlsWort.get(12));
	}

	@Test
	void dreizehn()
	{
		assertEquals("dreizehn", ZahlAlsWort.get(13));
	}

	@Test
	void vierzehn()
	{
		assertEquals("vierzehn", ZahlAlsWort.get(14));
	}

	@Test
	void fünfzehn()
	{
		assertEquals("fünfzehn", ZahlAlsWort.get(15));
	}

	@Test
	void sechzehn()
	{
		assertEquals("sechzehn", ZahlAlsWort.get(16));
	}

	@Test
	void siebzehn()
	{
		assertEquals("siebzehn", ZahlAlsWort.get(17));
	}

	@Test
	void achtzehn()
	{
		assertEquals("achtzehn", ZahlAlsWort.get(18));
	}

	@Test
	void neunzehn()
	{
		assertEquals("neunzehn", ZahlAlsWort.get(19));
	}

	@Test
	void zwanzig()
	{
		assertEquals("zwanzig", ZahlAlsWort.get(20));
	}

	@Test
	void einundzwanzig()
	{
		assertEquals("einundzwanzig", ZahlAlsWort.get(21));
	}

	@Test
	void zweiundzwanzig()
	{
		assertEquals("zweiundzwanzig", ZahlAlsWort.get(22));
	}

	@Test
	void dreiunddreissig()
	{
		assertEquals("dreiunddreißig", ZahlAlsWort.get(33));
	}

	@Test
	void sechzig()
	{
		assertEquals("sechzig", ZahlAlsWort.get(60));
	}

	@Test
	void sechsundsechzig()
	{
		assertEquals("sechsundsechzig", ZahlAlsWort.get(66));
	}

	@Test
	void siebzig()
	{
		assertEquals("siebzig", ZahlAlsWort.get(70));
	}

	@Test
	void siebenundsiebzig()
	{
		assertEquals("siebenundsiebzig", ZahlAlsWort.get(77));
	}

	@Test
	void neunundneunzig()
	{
		assertEquals("neunundneunzig", ZahlAlsWort.get(99));
	}

	@Test
	void einhundert()
	{
		assertEquals("einhundert", ZahlAlsWort.get(100));
	}

	@Test
	void einhunderteins()
	{
		assertEquals("einhunderteins", ZahlAlsWort.get(101));
	}

	@Test
	void einhundertfuenf()
	{
		assertEquals("einhundertfünf", ZahlAlsWort.get(105));
	}

	@Test
	void einhundertzehn()
	{
		assertEquals("einhundertzehn", ZahlAlsWort.get(110));
	}

	@Test
	void einhundertelf()
	{
		assertEquals("einhundertelf", ZahlAlsWort.get(111));
	}

	@Test
	void einhundertfuenundzwanzig()
	{
		assertEquals("einhundertfünfundzwanzig", ZahlAlsWort.get(125));
	}

	@Test
	void dreihundertneunundneunzig()
	{
		assertEquals("dreihundertneunundneunzig", ZahlAlsWort.get(399));
	}

	@Test
	void sechshundertsechzig()
	{
		assertEquals("sechshundertsechzig", ZahlAlsWort.get(660));
	}

	@Test
	void sechshundertsechsundsechzig()
	{
		assertEquals("sechshundertsechsundsechzig", ZahlAlsWort.get(666));
	}

	@Test
	void siebenhundertsiebzig()
	{
		assertEquals("siebenhundertsiebzig", ZahlAlsWort.get(770));
	}

	@Test
	void siebenhundertsiebenundsiebzig()
	{
		assertEquals("siebenhundertsiebenundsiebzig", ZahlAlsWort.get(777));
	}

	@Test
	void eintausend()
	{
		assertEquals("eintausend", ZahlAlsWort.get(1000));
	}

	@Test
	void eintausendeins()
	{
		assertEquals("eintausendeins", ZahlAlsWort.get(1001));
	}

	@Test
	void eintausendelf()
	{
		assertEquals("eintausendelf", ZahlAlsWort.get(1011));
	}

	@Test
	void eintausendeinhundertelf()
	{
		assertEquals("eintausendeinhundertelf", ZahlAlsWort.get(1111));
	}

	@Test
	void eintausendzweihundertelf()
	{
		assertEquals("eintausendzweihundertelf", ZahlAlsWort.get(1211));
	}

	@Test
	void eintausendfuenfhundertzweiundvierzig()
	{
		assertEquals("eintausendfünfhundertzweiundvierzig",
				ZahlAlsWort.get(1542));
	}

	@Test
	void zehntauseneins()
	{
		assertEquals("zehntausendeins", ZahlAlsWort.get(10001));
	}

	@Test
	void zehntauseneinhundert()
	{
		assertEquals("zehntausendeinhundert", ZahlAlsWort.get(10100));
	}

	@Test
	void einundvierzigtausend()
	{
		assertEquals("einundvierzigtausend", ZahlAlsWort.get(41000));
	}

	@Test
	void fuenfundfuenfzigtausendfuenfhundertfuenfundfuenfzig()
	{
		assertEquals("fünfundfünfzigtausendfünfhundertfünfundfünfzig",
				ZahlAlsWort.get(55555));
	}

	@Test
	void sechshundertsechzigtausen()
	{
		assertEquals("sechshundertsechzigtausend", ZahlAlsWort.get(660000));
	}

	@Test
	void sechshundertsechsundsechzigtausend()
	{
		assertEquals("sechshundertsechsundsechzigtausend",
				ZahlAlsWort.get(666000));
	}

	@Test
	void siebenhundertsiebzigtausend()
	{
		assertEquals("siebenhundertsiebzigtausend", ZahlAlsWort.get(770000));
	}

	@Test
	void siebenhundertsiebenundsiebzigtausend()
	{
		assertEquals("siebenhundertsiebenundsiebzigtausend",
				ZahlAlsWort.get(777000));
	}

	@Test
	void einhundertdreiundzwanzigtausendfünfhundertsiebenundsechzig()
	{
		assertEquals(
				"einhundertdreiundzwanzigtausendvierhundertsechsundfünfzig",
				ZahlAlsWort.get(123456));
	}

	@Test
	void einemillionzweihunderttausendvierhundert()
	{
		assertEquals("eine Million zweihunderttausendvierhundert",
				ZahlAlsWort.get(1200400));
	}

	@Test
	void zweihundertMillionenzweihunderttausendvierhundert()
	{
		assertEquals("zweihundert Millionen zweihunderttausendvierhundert",
				ZahlAlsWort.get(200200400));
	}

	@Test
	void vierhundertvierundvierzigmillioneneinhundertausend()
	{
		assertEquals("vierhundertvierundvierzig Millionen einhunderttausend",
				ZahlAlsWort.get(444100000));
	}

	@Test
	void fuenfundfuenfzigBigDecimal()
	{
		assertEquals("fünfundfünfzig",
				ZahlAlsWort.get(new BigDecimal("55.66")));
	}

	@Test
	void fuenfundfuenfzigDouble()
	{
		assertEquals("fünfundfünfzig", ZahlAlsWort.get(Double.valueOf(55.66)));
	}

	@Test
	void fuenfundfuenfzigFloat()
	{
		assertEquals("fünfundfünfzig", ZahlAlsWort.get(Float.valueOf(55.66f)));
	}

	@Test
	void einhunderteinundzwanzigtausendeinhundertdreiundzwanzig()
	{
		assertEquals("einhunderteinundzwanzigtausendeinhundertdreiundzwanzig",
				ZahlAlsWort.get(121123));
	}

}
