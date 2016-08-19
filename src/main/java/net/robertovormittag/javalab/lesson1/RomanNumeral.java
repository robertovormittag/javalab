package net.robertovormittag.javalab.lesson1;


// TODO improve class description
// it is not a converter
// see java.lang.Integer for ideas
/**
 * The {@code RomanNumeral} class wraps a {@code String} value representing a
 * Roman numeral in an object etc, etc
 * 
 * @author Simone Zaminga
 */
public class RomanNumeral implements Comparable<RomanNumeral> {

	// TODO *** no javadoc for private members ***
	// only the class public interface should be documented
	// use single line comments for private stuff if you need
	/**
	 * Initialize variable String number
	 */
	private String roman;

	/**
	 * Constructor permits to pass the Roman Number
	 * 
	 * @param number: initial number
	 */
	public RomanNumeral(String number) {
		validateState(number);
		this.roman = number;
	}

	// TODO implement this
	// move code from instance method here
	// then call this method from instance method
	public static int intValue(String roman) {

		return 0;
	}

	/**
	 * Method that takes this Roman numeral and converts it to integer
	 * 
	 * @return integer number equivalent of this Roman number
	 */
	public int intValue() {

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

	// TODO *** no javadoc for private members ***
	// this is only auxiliary method
	/**
	 * Method which use the algorithm to translate the Roman number in decimal
	 * 
	 * @param decimal
	 *            first decimal number
	 * @param lastNumber
	 *            last number
	 * @param lastDecimal
	 *            last decimal number
	 * @return Decimal Number
	 */
	private static int processDecimal(int decimal, int lastNumber, int lastDecimal) {

		if (lastNumber > decimal) {

			return lastDecimal - decimal;

		} else {

			return lastDecimal + decimal;

		}
	}
	
	// TODO *** no javadoc for private members ***
	// this is only auxiliary method
	/**
	 * Method that check if the Roman Number is correct
	 * 
	 * @exception IllegalArgumentException
	 *                if the number is null
	 * @exception IllegalArgumentException
	 *                if the number is a empty string
	 * @exception IllegalArgumentException
	 *                if the number is a invalid Roman number
	 * @param number
	 */
	private void validateState(String number) {

		if (number == null)
			throw new IllegalArgumentException("Null argument");

		if (number.isEmpty())
			throw new IllegalArgumentException("Empty string");

		if (!number.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"))
			throw new IllegalArgumentException("Invalid Roman number");

	}

	// TODO missing comment
	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof RomanNumeral)) {
			RomanNumeral decimal = (RomanNumeral) obj;
			if (roman.equals(decimal.roman)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	// TODO missing comment
	/**
	 * 
	 */
	@Override
	public int hashCode() {

		return roman.hashCode();
	}

	// TODO add javadoc here: this is a public method
	public int compareTo(RomanNumeral other) {
		
		// TODO improve this implementation
		// Compare RomanNumber
		if (this.intValue() < other.intValue())
			return -1;
		if (this.intValue() > other.intValue())
			return 1;
		return 0;
		
		// TODO this was better:
		// return this.convertToInteger() - other.convertToInteger();

	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.roman;
	}	

}
