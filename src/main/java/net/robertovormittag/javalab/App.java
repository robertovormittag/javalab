package net.robertovormittag.javalab;

import net.robertovormittag.javalab.lesson1.RomanNumeral;

public class App {
	
    public static void main( String[] args ) {
    	
        RomanNumeral xv = new RomanNumeral("XV");
    	System.out.println("Roman numeral " + xv + " is decimal " + xv.intValue());
        
    }
}
