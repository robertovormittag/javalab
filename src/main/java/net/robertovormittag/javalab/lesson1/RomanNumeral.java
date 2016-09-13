package net.robertovormittag.javalab.lesson1;


// TODO implement java.lang.Comparable
// TODO use javadoc comments on public elements
// otherwise your users don't know how this works
// users do not have access to source code!
/**
 * A converter from Roman Number to Decimal
 * @author Simone Zaminga
 */
public class RomanNumeral implements Comparable <RomanNumeral>{

		
		/**
		 *	Initialize variable String number 
		 */
		private String roman;
		
		/**
		 * Constructor permits to pass the Roman Number 
		 * @param number initial number
		 */
		public RomanNumeral (String number){
			validateState(number);
			this.roman = number;
		}
		
		/**
		 * Method that takes the Roman Number and assigns to it the correct decimal translation
		 * @return integer number equivalent of the Roman number
		 */
		public static int intValue (String roman)  {
			
			int decimal = 0;
			int lastNumber = 0;
			
			roman = roman.toUpperCase();
			for (int x = roman.length() - 1; x >= 0; x--) {
				char convertNumber = roman.charAt(x);
				
				switch (convertNumber) {
				
				case 'M':
                    decimal = processDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = processDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    
                    lastNumber = 1;
                    break;
				
				}
			
			}
			
			return decimal;

			
		}
		
		public int intValue() {
			
			int rn = RomanNumeral.intValue(roman);
			return rn;
		}
		
			 /**
			  * Method which use the algorithm to translate the Roman number in decimal
			  * @param decimal first decimal number
			  * @param lastNumber last number
			  * @param lastDecimal last decimal number
			  * @return Decimal Number
			  */
			  static int processDecimal(int decimal, int lastNumber, int lastDecimal) {

			        if (lastNumber > decimal) {

			            return lastDecimal - decimal;

			        } else {

			            return lastDecimal + decimal;
			        }
			    }
			  
			 private void validateState(String number){
				
		           if (number == null)
		                throw new IllegalArgumentException("Null argument");
		           
		           if (number.isEmpty())
		                throw new IllegalArgumentException("Empty string");
		           
		           
		           if (!number.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"))
		                throw new IllegalArgumentException("Invalid Roman number");    
		           
		    }
			 
			 
			 
			 @Override
			 public boolean equals(Object obj){
				    if ((obj instanceof RomanNumeral)) {
				        RomanNumeral decimal = (RomanNumeral)obj;
				        if (roman.equals(decimal.roman)) {
				            return true;
				        }
				        else {
				            return false;
				        }
				    }
				    else {
				        return false;
				    }
				}
			 
			
			 @Override
			 public int hashCode(){
					
					return roman.hashCode();
				}
			 
			 
			 public int compareTo(RomanNumeral other){				 
				    
				  return this.intValue() -  other.intValue();
				 
				 	  }
			 
			 
			@Override
			public String toString() {
				return roman.toString();
			}
			
	}


			 

			   
				 
						


		
	   


