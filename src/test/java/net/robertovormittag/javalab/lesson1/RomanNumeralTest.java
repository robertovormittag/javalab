package net.robertovormittag.javalab.lesson1;

import static org.junit.Assert.*;
import org.junit.Test;

public class RomanNumeralTest {


	@Test
	public void shouldConvert_I_to_1() {
		RomanNumeral rn = new RomanNumeral("I");
		int number = rn.intValue();
		assertTrue(number == 1);
	}
	
	@Test
	public void shouldConvert_II_to_2() {
			RomanNumeral rn = new RomanNumeral("II");
			int number = rn.intValue();
			assertTrue(number == 2);
	}
	
	@Test
	public void shouldConvert_III_to_3() {
		RomanNumeral rn = new RomanNumeral("III");
		int number = rn.intValue();
		assertTrue(number == 3);
	}
	
	@Test
	public void shouldConvert_IV_to_4() {
		RomanNumeral rn = new RomanNumeral("IV");
		int number = rn.intValue();
		assertTrue(number == 4);
	}
	
	@Test
	public void shouldConvert_V_to_5() {
		RomanNumeral rn = new RomanNumeral("V");
		int number = rn.intValue();
		assertTrue(number == 5);
	}
	
	@Test
	public void shouldConvert_VI_to_6() {
		RomanNumeral rn = new RomanNumeral("VI");
		int number = rn.intValue();
		assertTrue(number == 6);
	}
	
	@Test
	public void shouldConvert_VII_to_7() {
		RomanNumeral rn = new RomanNumeral("VII");
		int number = rn.intValue();
		assertTrue(number == 7);
	}
	
	@Test
	public void shouldConvert_VIII_to_8() {
		RomanNumeral rn = new RomanNumeral("VIII");
		int number = rn.intValue();
		assertTrue(number == 8);
	}
	
	@Test
	public void shouldConvert_IX_to_9() {
		RomanNumeral rn = new RomanNumeral("IX");
		int number = rn.intValue();
		assertTrue(number == 9);
	}
	
	@Test
	public void shouldConvert_X_to_10() {
		RomanNumeral rn = new RomanNumeral("X");
		int number = rn.intValue();
		assertTrue(number == 10);
	}
	
	@Test
	public void shouldConvert_L_to_50() {
		RomanNumeral rn = new RomanNumeral("L");
		int number = rn.intValue();
		assertTrue(number == 50);	
	}
	
	@Test
	public void shouldConvert_C_to_100() {
		RomanNumeral rn = new RomanNumeral("C");
		int number = rn.intValue();
		assertTrue(number == 100);
	}
	
	@Test
	public void shouldConvert_D_to_500() {
		RomanNumeral rn = new RomanNumeral("D");
		int number = rn.intValue();
		assertTrue(number == 500);
	}
	
	@Test
    public void shouldCONVERT_M_to_1000() {
        RomanNumeral rn = new RomanNumeral("M");
        int number = rn.intValue();
        assertTrue(number==1000);
	}
	
	@Test
    public void shouldConvert_CMIII_to_903() {
		RomanNumeral rn = new RomanNumeral("CMIII");
        int number = rn.intValue();
        assertTrue(number == 903);
	}
	
	@Test
    public void shouldConvert_CCXXXVI_to_236() {
		RomanNumeral rn = new RomanNumeral("CCXXXVI");
        int number = rn.intValue();
        assertTrue(number == 236);
	}
	
	@Test
    public void shouldConvert_CLXXVII_to_67() {
		RomanNumeral rn = new RomanNumeral("CLXXVII");
        int number = rn.intValue();
        assertTrue(number == 177);
	}
	
	@Test
    public void shouldConvert_MMMCCXLV_to_3245() {
		RomanNumeral rn = new RomanNumeral("MMMCCXLV");
        int number = rn.intValue();
        assertTrue(number == 3245);
	}
	
	@Test
    public void shouldConvert_MMDLI_to_2551() {
		RomanNumeral rn = new RomanNumeral("MMDLI");
        int number = rn.intValue();
        assertTrue(number == 2551);
	}
	
	@Test
    public void shouldConvert_MMMDCCCXCIX_to_3899() {
		RomanNumeral rn = new RomanNumeral("MMMDCCCXCIX");
        int number = rn.intValue();
        assertTrue(number == 3899);
	}
	
	@Test
    public void shouldConvert_CCXXXII_to_232() {
		RomanNumeral rn = new RomanNumeral("CCXXXII");
        int number = rn.intValue();
        assertTrue(number == 232);
	}
	
	@Test
    public void shouldConvert_MMIX_to_2009() {
		RomanNumeral rn = new RomanNumeral("MMIX");
        int number = rn.intValue();
        assertTrue(number == 2009);
	}
	
	@Test
    public void shouldConvert_MDCCXIII_to_1713() {
		RomanNumeral rn = new RomanNumeral("MDCCXIII");
        int number = rn.intValue();
        assertTrue(number == 1713);
	}
	
	@Test
    public void shouldConvert_MCCCXXIX_to_1329() {
		RomanNumeral rn = new RomanNumeral("MCCCXXIX");
        int number = rn.intValue();
        assertTrue(number == 1329);
	}
	
	@Test
    public void shouldConvert_DCCCXLIX_to_849() {
		RomanNumeral rn = new RomanNumeral("DCCCXLIX");
        int number = rn.intValue();
        assertTrue(number == 849);
	}
	
	@Test
    public void shouldConvert_MMMCCCLXXXII_to_3382() {
		RomanNumeral rn = new RomanNumeral("MMMCCCLXXXII");
        int number = rn.intValue();
        assertTrue(number == 3382);
	}
	
	@Test
    public void shouldConvert_DCCLXXXI_to_781() {
		RomanNumeral rn = new RomanNumeral("DCCLXXXI");
        int number = rn.intValue();
        assertTrue(number == 781);
	}
	
	@Test
    public void shouldConvert_MMCMLXXXIX_to_2989() {
		RomanNumeral rn = new RomanNumeral("MMCMLXXXIX");
        int number = rn.intValue();
        assertTrue(number == 2989);
	}
	
	@Test
    public void shouldConvert_MMMCCXXXVIII_to_3238() {
		RomanNumeral rn = new RomanNumeral("MMMCCXXXVIII");
        int number = rn.intValue();
        assertTrue(number == 3238);
	}
	
	@Test
    public void shouldConvert_MXXXIX_to_1039() {
		RomanNumeral rn = new RomanNumeral("MXXXIX");
        int number = rn.intValue();
        assertTrue(number == 1039);
	}
	
	@Test
    public void shouldConvert_DCXLIII_to_643() {
		RomanNumeral rn = new RomanNumeral("DCXLIII");
        int number = rn.intValue();
        assertTrue(number == 643);
	}
	
	@Test
    public void shouldConvert_MCCXCV_to_1295() {
		RomanNumeral rn = new RomanNumeral("MCCXCV");
        int number = rn.intValue();
        assertTrue(number == 1295);
	}
	
	@Test
    public void shouldConvert_MMDCCCLIX_to_2859() {
		RomanNumeral rn = new RomanNumeral("MMDCCCLIX");
        int number = rn.intValue();
        assertTrue(number == 2859);
	}
	
	@Test
    public void shouldConvert_MMCDXVIII_to_2418() {
		RomanNumeral rn = new RomanNumeral("MMCDXVIII");
        int number = rn.intValue();
        assertTrue(number == 2418);
	}
	
	@Test(expected = Exception.class)
    public void shouldThrowExceptionForNullArg() {
        new RomanNumeral(null);
    }    
	
	@Test(expected = Exception.class)
    public void shouldThrowExceptionForEmptyString() {
        new RomanNumeral("");
	}
	
	@Test(expected = Exception.class)
    public void shouldThrowExceptionFor_IXC() {
		new RomanNumeral("IXC");
	}
	
	@Test
    public void shouldNotInstantiate_IXC() {
		RomanNumeral rn = null;
		try {
			rn = new RomanNumeral("IXC");
		}
		catch (Exception ex) {
			assertNull(rn);			
		}
		
		assertNull(rn);	

	}


	// TODO add more invalid test cases
	@Test(expected = Exception.class)
    public void shouldThrowExceptionFor_IXC() {
		new RomanNumber("IXC");   
	}
	
	@Test(expected = Exception.class)
    public void shouldThrowExceptionFor_MMMMM() {
		new RomanNumber("MMMMM");   
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_IIIII() {
		new RomanNumber("IIIII");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_IXIXXXXXVV() {
		new RomanNumber("IXIXXXXXVV");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_CAS0998EXXXI() {
		new RomanNumber("CAS0998EXXXI");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_1999() {
		new RomanNumber("1999");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_ABCDEFGHIII() {
		new RomanNumber("ABCDEFGHIII");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_MMIMM() {
		new RomanNumber("MMIMM");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_ixixmmixviv() {
		new RomanNumber("ixixmmixviv");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_DD() {
		new RomanNumber("DD");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_DID() {
		new RomanNumber("DID");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_MM_MMI() {
		new RomanNumber("MM MMI");
	}
	
	// TODO add more test cases
	@Test
	public void testEquals(){
		RomanNumeral rn1 = new RomanNumeral("M");
		RomanNumeral rn2 = new RomanNumeral("M");
		assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	// TODO add more test cases
	@Test
	public void testHashCode(){
		RomanNumeral rn1 = new RomanNumeral("M");
		RomanNumeral rn2 = new RomanNumeral("M");
		assertTrue(rn1.hashCode() == rn2.hashCode());
	
	}

	
	// TODO test instance comparison
	@Test
	public void shouldCompareInstances() {
		
		//if (rn1.compareTo(rn2) == 1) {
			// do stuff
		//}
		
	}
	
	// TODO test toString method
	@Test
	public void testToString() {
		
	}
		
	
	
}
