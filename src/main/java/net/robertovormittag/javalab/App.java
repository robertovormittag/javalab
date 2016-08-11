package net.robertovormittag.javalab;

import java.util.HashMap;
import java.util.Map;

import net.robertovormittag.javalab.lesson1.RomanNumeral;

public class App {
	
    public static void main( String[] args ) {
    	
    	Map<RomanNumeral, String> commandments = new HashMap<RomanNumeral, String>();
    	    	
        RomanNumeral I= new RomanNumeral("I");
        String first = "You shall have no other gods before Me";
        commandments.put(I, first);
        
        
    }
}
