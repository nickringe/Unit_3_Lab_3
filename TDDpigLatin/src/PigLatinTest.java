import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinTest {

	@Test
	void testLowercaseA() {
		String expected = "appleway";
		String actual = PigLatin.translate("aPPlE");
		assertEquals(expected, actual);
	}
	@Test
	void testLowercaseE() {
		String expected = "eppleway";
		String actual = PigLatin.translate("ePPlE");
		assertEquals(expected, actual);
	}
	@Test
	void testLowercaseI() {
		String expected = "ippleway";
		String actual = PigLatin.translate("iPPlE");
		assertEquals(expected, actual);
	}
	@Test
	void testLowercaseO() {
		String expected = "oppleway";
		String actual = PigLatin.translate("oPPlE");
		assertEquals(expected, actual);
	}
	@Test
	void testLowercaseU() {
		String expected = "uppleway";
		String actual = PigLatin.translate("uPPlE");
		assertEquals(expected, actual);
	}
	
	@Test
	void testVowelStart() {
		String expected = "ippleway";
		String actual = PigLatin.translate("ipple");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFindVowelOne() {
		String expected = "icknay";
		String actual = PigLatin.findVowel("nick");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFindVowelTwo() {
		String expected = "ickzay";
		String actual = PigLatin.findVowel("zick");
		assertEquals(expected, actual);
	}
	@Test
	void testFindVowelOneTwoCons() {
		String expected = "ickzzay";
		String actual = PigLatin.findVowel("zzick");
		assertEquals(expected, actual);
	}
	@Test
	void testFindVowelOneThreeCons() {
		String expected = "ickzzzay";
		String actual = PigLatin.findVowel("zzzick");
		assertEquals(expected, actual);
	}
}
