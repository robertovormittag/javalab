package net.robertovormittag.javalab.lesson1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * A class to test Roman Number Class
 * We have a lot of extremely test for every methods
 * implemented on the master class
 * @author Simone Zaminga
 */
public class RomanNumeralTest {
	
	/**
	* Convert I to 1
	*/
	@Test
	public void shouldConvert_I_to_1() {
		/**
		* Convert I to 1
		*/
		RomanNumeral rn = new RomanNumeral("I");
		int number = rn.convertToInteger();
		assertTrue(number == 1);
	}
	
	@Test
	public void shouldConvert_II_to_2() {
		/* Convert II to 2 */
		RomanNumeral rn = new RomanNumeral("II");
		int number = rn.convertToInteger();
		assertTrue(number == 2);
	}
	
	@Test
	public void shouldConvert_III_to_3() {
		RomanNumeral rn = new RomanNumeral("III");
		int number = rn.convertToInteger();
		assertTrue(number == 3);
	}
	
	@Test
	public void shouldConvert_IV_to_4() {
		RomanNumeral rn = new RomanNumeral("IV");
		int number = rn.convertToInteger();
		assertTrue(number == 4);
	}
	
	@Test
	public void shouldConvert_V_to_5() {
		RomanNumeral rn = new RomanNumeral("V");
		int number = rn.convertToInteger();
		assertTrue(number == 5);
	}
	
	@Test
	public void shouldConvert_VI_to_6() {
		RomanNumeral rn = new RomanNumeral("VI");
		int number = rn.convertToInteger();
		assertTrue(number == 6);
	}
	
	@Test
	public void shouldConvert_VII_to_7() {
		RomanNumeral rn = new RomanNumeral("VII");
		int number = rn.convertToInteger();
		assertTrue(number == 7);
	}
	
	@Test
	public void shouldConvert_VIII_to_8() {
		RomanNumeral rn = new RomanNumeral("VIII");
		int number = rn.convertToInteger();
		assertTrue(number == 8);
	}
	
	@Test
	public void shouldConvert_IX_to_9() {
		RomanNumeral rn = new RomanNumeral("IX");
		int number = rn.convertToInteger();
		assertTrue(number == 9);
	}
	
	@Test
	public void shouldConvert_X_to_10() {
		RomanNumeral rn = new RomanNumeral("X");
		int number = rn.convertToInteger();
		assertTrue(number == 10);
	}
	
	@Test
	public void shouldConvert_L_to_50() {
		RomanNumeral rn = new RomanNumeral("L");
		int number = rn.convertToInteger();
		assertTrue(number == 50);	
	}
	
	@Test
	public void shouldConvert_C_to_100() {
		RomanNumeral rn = new RomanNumeral("C");
		int number = rn.convertToInteger();
		assertTrue(number == 100);
	}
	
	@Test
	public void shouldConvert_D_to_500() {
		RomanNumeral rn = new RomanNumeral("D");
		int number = rn.convertToInteger();
		assertTrue(number == 500);
	}
	
	@Test
    public void shouldCONVERT_M_to_1000() {
        RomanNumeral rn = new RomanNumeral("M");
        int number = rn.convertToInteger();
        assertTrue(number==1000);
	}
	
	@Test
    public void shouldConvert_CMIII_to_903() {
		RomanNumeral rn = new RomanNumeral("CMIII");
        int number = rn.convertToInteger();
        assertTrue(number == 903);
	}
	
	@Test
    public void shouldConvert_CCXXXVI_to_236() {
		RomanNumeral rn = new RomanNumeral("CCXXXVI");
        int number = rn.convertToInteger();
        assertTrue(number == 236);
	}
	
	@Test
    public void shouldConvert_CLXXVII_to_67() {
		RomanNumeral rn = new RomanNumeral("CLXXVII");
        int number = rn.convertToInteger();
        assertTrue(number == 177);
	}
	
	@Test
    public void shouldConvert_MMMCCXLV_to_3245() {
		RomanNumeral rn = new RomanNumeral("MMMCCXLV");
        int number = rn.convertToInteger();
        assertTrue(number == 3245);
	}
	
	@Test
    public void shouldConvert_MMDLI_to_2551() {
		RomanNumeral rn = new RomanNumeral("MMDLI");
        int number = rn.convertToInteger();
        assertTrue(number == 2551);
	}
	
	@Test
    public void shouldConvert_MMMDCCCXCIX_to_3899() {
		RomanNumeral rn = new RomanNumeral("MMMDCCCXCIX");
        int number = rn.convertToInteger();
        assertTrue(number == 3899);
	}
	
	@Test
    public void shouldConvert_CCXXXII_to_232() {
		RomanNumeral rn = new RomanNumeral("CCXXXII");
        int number = rn.convertToInteger();
        assertTrue(number == 232);
	}
	
	@Test
    public void shouldConvert_MMIX_to_2009() {
		RomanNumeral rn = new RomanNumeral("MMIX");
        int number = rn.convertToInteger();
        assertTrue(number == 2009);
	}
	
	@Test
    public void shouldConvert_MDCCXIII_to_1713() {
		RomanNumeral rn = new RomanNumeral("MDCCXIII");
        int number = rn.convertToInteger();
        assertTrue(number == 1713);
	}
	
	@Test
    public void shouldConvert_MCCCXXIX_to_1329() {
		RomanNumeral rn = new RomanNumeral("MCCCXXIX");
        int number = rn.convertToInteger();
        assertTrue(number == 1329);
	}
	
	@Test
    public void shouldConvert_DCCCXLIX_to_849() {
		RomanNumeral rn = new RomanNumeral("DCCCXLIX");
        int number = rn.convertToInteger();
        assertTrue(number == 849);
	}
	
	@Test
    public void shouldConvert_MMMCCCLXXXII_to_3382() {
		RomanNumeral rn = new RomanNumeral("MMMCCCLXXXII");
        int number = rn.convertToInteger();
        assertTrue(number == 3382);
	}
	
	@Test
    public void shouldConvert_DCCLXXXI_to_781() {
		RomanNumeral rn = new RomanNumeral("DCCLXXXI");
        int number = rn.convertToInteger();
        assertTrue(number == 781);
	}
	
	@Test
    public void shouldConvert_MMCMLXXXIX_to_2989() {
		RomanNumeral rn = new RomanNumeral("MMCMLXXXIX");
        int number = rn.convertToInteger();
        assertTrue(number == 2989);
	}
	
	@Test
    public void shouldConvert_MMMCCXXXVIII_to_3238() {
		RomanNumeral rn = new RomanNumeral("MMMCCXXXVIII");
        int number = rn.convertToInteger();
        assertTrue(number == 3238);
	}
	
	@Test
    public void shouldConvert_MXXXIX_to_1039() {
		RomanNumeral rn = new RomanNumeral("MXXXIX");
        int number = rn.convertToInteger();
        assertTrue(number == 1039);
	}
	
	@Test
    public void shouldConvert_DCXLIII_to_643() {
		RomanNumeral rn = new RomanNumeral("DCXLIII");
        int number = rn.convertToInteger();
        assertTrue(number == 643);
	}
	
	@Test
    public void shouldConvert_MCCXCV_to_1295() {
		RomanNumeral rn = new RomanNumeral("MCCXCV");
        int number = rn.convertToInteger();
        assertTrue(number == 1295);
	}
	
	@Test
    public void shouldConvert_MMDCCCLIX_to_2859() {
		RomanNumeral rn = new RomanNumeral("MMDCCCLIX");
        int number = rn.convertToInteger();
        assertTrue(number == 2859);
	}
	
	@Test
    public void shouldConvert_MMCDXVIII_to_2418() {
		RomanNumeral rn = new RomanNumeral("MMCDXVIII");
        int number = rn.convertToInteger();
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
	
	@Test(expected = Exception.class)
    public void shouldThrowExceptionFor_MMMMM() {
		new RomanNumeral("MMMMM");   
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_IIIII() {
		new RomanNumeral("IIIII");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_IXIXXXXXVV() {
		new RomanNumeral("IXIXXXXXVV");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_CAS0998EXXXI() {
		new RomanNumeral("CAS0998EXXXI");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_1999() {
		new RomanNumeral("1999");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_ABCDEFGHIII() {
		new RomanNumeral("ABCDEFGHIII");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_MMIMM() {
		new RomanNumeral("MMIMM");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_ixixmmixviv() {
		new RomanNumeral("ixixmmixviv");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_DD() {
		new RomanNumeral("DD");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_DID() {
		new RomanNumeral("DID");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_MM_MMI() {
		new RomanNumeral("MM MMI");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_CICXXIC() {
		new RomanNumeral("CICXXIC");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_MCCCCCI() {
		new RomanNumeral("MCCCCCI");
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionFor_LIDI() {
		new RomanNumeral("LIDI");
	}

	@Test
	public void testEquals_M(){
		RomanNumeral rn1 = new RomanNumeral("M");
		RomanNumeral rn2 = new RomanNumeral("M");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_XCIX(){
		RomanNumeral rn1 = new RomanNumeral("XCIX");
		RomanNumeral rn2 = new RomanNumeral("XCIX");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_XX(){
		RomanNumeral rn1 = new RomanNumeral("XX");
		RomanNumeral rn2 = new RomanNumeral("XX");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_LVII(){
		RomanNumeral rn1 = new RomanNumeral("LVII");
		RomanNumeral rn2 = new RomanNumeral("LVII");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_MMMXVI(){
		RomanNumeral rn1 = new RomanNumeral("MMMXVI");
		RomanNumeral rn2 = new RomanNumeral("MMMXVI");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_CMVII(){
		RomanNumeral rn1 = new RomanNumeral("CMVII");
		RomanNumeral rn2 = new RomanNumeral("CMVII");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_LXI(){
		RomanNumeral rn1 = new RomanNumeral("LXI");
		RomanNumeral rn2 = new RomanNumeral("LXI");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_MCIV(){
		RomanNumeral rn1 = new RomanNumeral("MCIV");
		RomanNumeral rn2 = new RomanNumeral("MCIV");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_MMMDL(){
		RomanNumeral rn1 = new RomanNumeral("MMMDL");
		RomanNumeral rn2 = new RomanNumeral("MMMDL");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_CV(){
		RomanNumeral rn1 = new RomanNumeral("CV");
		RomanNumeral rn2 = new RomanNumeral("CV");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_LVIII(){
		RomanNumeral rn1 = new RomanNumeral("LVIII");
		RomanNumeral rn2 = new RomanNumeral("LVIII");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_CCXC(){
		RomanNumeral rn1 = new RomanNumeral("CCXC");
		RomanNumeral rn2 = new RomanNumeral("CCXC");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_MMMLIX(){
		RomanNumeral rn1 = new RomanNumeral("MMMLIX");
		RomanNumeral rn2 = new RomanNumeral("MMMLIX");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_DLIX(){
		RomanNumeral rn1 = new RomanNumeral("DLIX");
		RomanNumeral rn2 = new RomanNumeral("DLIX");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_MCMLIX(){
		RomanNumeral rn1 = new RomanNumeral("MCMLIX");
		RomanNumeral rn2 = new RomanNumeral("MCMLIX");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testEquals_LXIII(){
		RomanNumeral rn1 = new RomanNumeral("LXIII");
		RomanNumeral rn2 = new RomanNumeral("LXIII");
		Assert.assertTrue(rn1.equals(rn2) && rn2.equals(rn1));		
	}
	
	@Test
	public void testHashCode_IX(){
		RomanNumeral rn1 = new RomanNumeral("IX");
		RomanNumeral rn2 = new RomanNumeral("IX");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_MMM(){
		RomanNumeral rn1 = new RomanNumeral("MMM");			
		RomanNumeral rn2 = new RomanNumeral("MMM");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
	
	@Test
	public void testHashCode_DXXXIX(){
		RomanNumeral rn1 = new RomanNumeral("DXXXIX");
		RomanNumeral rn2 = new RomanNumeral("DXXXIX");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
	
	@Test
	public void testHashCode_LVII(){
		RomanNumeral rn1 = new RomanNumeral("LVII");
		RomanNumeral rn2 = new RomanNumeral("LVII");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_CCCXIX(){
		RomanNumeral rn1 = new RomanNumeral("CCCXIX");
		RomanNumeral rn2 = new RomanNumeral("CCCXIX");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
	
	@Test
	public void testHashCode_DCLIV(){
		RomanNumeral rn1 = new RomanNumeral("DCLIV");
		RomanNumeral rn2 = new RomanNumeral("DCLIV");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_MMLI(){
		RomanNumeral rn1 = new RomanNumeral("MMLI");
		RomanNumeral rn2 = new RomanNumeral("MMLI");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_CLXXVII(){
		RomanNumeral rn1 = new RomanNumeral("CLXXVII");
		RomanNumeral rn2 = new RomanNumeral("CLXXVII");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
	@Test
	public void testHashCode_CCCIX(){
		RomanNumeral rn1 = new RomanNumeral("CCCIX");
		RomanNumeral rn2 = new RomanNumeral("CCCIX");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_DXLI(){
		RomanNumeral rn1 = new RomanNumeral("DXLI");
		RomanNumeral rn2 = new RomanNumeral("DXLI");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_LIII(){
		RomanNumeral rn1 = new RomanNumeral("LIII");
		RomanNumeral rn2 = new RomanNumeral("LIII");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_XXXIV(){
		RomanNumeral rn1 = new RomanNumeral("XXXIV");
		RomanNumeral rn2 = new RomanNumeral("XXXIV");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_VII(){
		RomanNumeral rn1 = new RomanNumeral("VII");
		RomanNumeral rn2 = new RomanNumeral("VII");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_MDCCCIV(){
		RomanNumeral rn1 = new RomanNumeral("MDCCCIV");
		RomanNumeral rn2 = new RomanNumeral("MDCCCIV");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_MCMLXXVI(){
		RomanNumeral rn1 = new RomanNumeral("MCMLXXVI");
		RomanNumeral rn2 = new RomanNumeral("MCMLXXVI");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_DXXV(){
		RomanNumeral rn1 = new RomanNumeral("DXXV");
		RomanNumeral rn2 = new RomanNumeral("DXXV");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_MMDIV(){
		RomanNumeral rn1 = new RomanNumeral("MMDIV");
		RomanNumeral rn2 = new RomanNumeral("MMDIV");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_LI(){
		RomanNumeral rn1 = new RomanNumeral("LI");
		RomanNumeral rn2 = new RomanNumeral("LI");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_CCXC(){
		RomanNumeral rn1 = new RomanNumeral("CCXC");
		RomanNumeral rn2 = new RomanNumeral("CCXC");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_MMMCDLXXXIV(){
		RomanNumeral rn1 = new RomanNumeral("MMMCDLXXXIV");
		RomanNumeral rn2 = new RomanNumeral("MMMCDLXXXIV");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
		
	@Test
	public void testHashCode_MMDLXXVIII(){
		RomanNumeral rn1 = new RomanNumeral("MMDLXXVIII");
		RomanNumeral rn2 = new RomanNumeral("MMDLXXVIII");
		Assert.assertTrue(rn1.hashCode() == rn2.hashCode());
	}
	
	// TODO test instance comparison
	
	@Test
	public void shouldCompareInstances_MMM_MMM() {
		
		RomanNumeral rn1 = new RomanNumeral("MMM");
		RomanNumeral rn2 = new RomanNumeral("MMM");
		
			if (rn1.compareTo(rn2) == -1){
				Assert.assertTrue(rn1.compareTo(rn2) == -1);	
			}
			if (rn1.compareTo(rn2) == 1){
				Assert.assertTrue(rn1.compareTo(rn2) == 1);
			}
			if (rn1.compareTo(rn2) == 0){
				Assert.assertTrue(rn1.compareTo(rn2) == 0);
			}
	}
	
	@Test
	public void shouldCompareInstances_M_XI() {
		
		RomanNumeral rn1 = new RomanNumeral("M");
		RomanNumeral rn2 = new RomanNumeral("XI");
		
			if (rn1.compareTo(rn2) == -1){
				Assert.assertTrue(rn1.compareTo(rn2) == -1);	
			}
			if (rn1.compareTo(rn2) == 1){
				Assert.assertTrue(rn1.compareTo(rn2) == 1);
			}
			if (rn1.compareTo(rn2) == 0){
				Assert.assertTrue(rn1.compareTo(rn2) == 0);
			}
	}
	
				
		
			
		
	

		
		
	

	
	// TODO test toString method
	@Test
	public void testToString() {
	}
	

}



