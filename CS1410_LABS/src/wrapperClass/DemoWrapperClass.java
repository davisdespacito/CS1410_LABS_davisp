package wrapperClass;

import java.util.Arrays;
import java.util.Random;

/**
 * My submission for "DemoWrapperClass"
 * 
 * @author davisp
 */
public class DemoWrapperClass {

	/**
	 * Random object <code>random</code> that will be used for both random methods
	 */
	private static final Random random = new Random();

	/**
	 * Dynamically grabs the min/max of the 6 number wrapper types, and displays
	 * both the max and the min
	 * 
	 * @return formatted String including min/max of each num. wrapper type
	 */
	public static String minMax() {

		return String.format(

				"%-7s: [%d , %d]\n" + "%-7s: [%d , %d]\n" + "%-7s: [%d , %d]\n" + "%-7s: [%d , %d]\n"
						+ "%-7s: [%s , %s]\n" + "%-7s: [%s , %s]",

				"Byte", Byte.MIN_VALUE, Byte.MAX_VALUE, "Short", Short.MIN_VALUE, Short.MAX_VALUE, "Integer",
				Integer.MIN_VALUE, Integer.MAX_VALUE, "Long", Long.MIN_VALUE, Long.MAX_VALUE, "Float", Float.MIN_VALUE,
				Float.MAX_VALUE, "Double", Double.MIN_VALUE, Double.MAX_VALUE

		);
	}

	/**
	 * Shows an int, <code>input</code>, in Base 10, 16, 8, and 2 (binary)
	 * 
	 * @param input
	 * @return formatted String, containing the number as the expected base(s)
	 */
	public static String numberRepresentations(int input) {

		return String.format(

				"%-7s  %-7s  %-7s  %s", Integer.toString(input, 10), Integer.toString(input, 16),
				Integer.toString(input, 8), Integer.toBinaryString(input)

		);
	}

	/**
	 * If a special character then it is noted, otherwise just the input to String
	 * is returned
	 * 
	 * @param input
	 * @return input converted to String
	 */
	public static String charProperties(char input) {

		if (Character.isLowerCase(input)) {
			return Character.toString(input) + " lowercase letter";
		} else if (Character.isUpperCase(input)) {
			return Character.toString(input) + " uppercase letter";
		} else if (Character.isDigit(input)) {
			return Character.toString(input) + " number";
		} else if (Character.isWhitespace(input)) {
			return Character.toString(input) + " white space";
		} else {
			return Character.toString(input);
		}
	}

	/**
	 * Adds all of the entries in the String[] together, and returns as
	 * <code>double</code>. If the array is either empty or has <code>null</code> as
	 * the only entry, <code>0</code> is returned.
	 * 
	 * @param input
	 * @return <code>double base</code> (set to 0), after being ran through a
	 *         <code>for(each)</code> loop, adding each instance onto itself
	 */
	public static double parseSum(String[] input) {
		double base = 0;

		if (input == null || input.length < 1) {
			return 0;
		} else {
			for (String i : input) {
				base += Double.parseDouble(i);
			}
			return base;
		}

	}

	/**
	 * Generates and returns a random 3-digit number as an <code>int</code>, using a
	 * private, final, static Random object named <code>random</code>
	 * 
	 * @return random 3-digit number as <code>int</code>
	 */
	public static int getRandomThreeDigitNumber() {
		int max = 999;
		int min = 100;

		int result = min + random.nextInt(max - min + 1);
		return result;
	}

	/**
	 * 
	 * @return
	 */
	public static char getRandomLetter() {

		int result;

		int upperOrLower = random.nextInt(2);
		if (upperOrLower == 1) {
			result = random.nextInt(26) + 65;
		} else {
			result = random.nextInt(26) + 97;
		}

		return ((char) result);

	}

	/**
	 * Demonstrates the functionality provided in class DemoWrapperClass.
	 *
	 */
	public static void main(String[] args) {

		// Method minMax:
		System.out.println(minMax());
		System.out.println();

		// Method numberRepresentations:
		int[] numbers = { 9, 17, getRandomThreeDigitNumber(), 9876, 12345 };

		System.out.printf("%-7s %-7s %-6s %s%n", "Base 10", "Base 16", "Base 8", "Base 2");
		System.out.printf("%-7s %-7s %-6s %s%n", "-------", "-------", "------", "------");
		for (int n : numbers) {
			System.out.println(numberRepresentations(n));
		}
		System.out.println();

		// Method charProperties:
		char[] characters = { '8', ' ', '#', 'a', 'M', getRandomLetter() };

		for (char c : characters) {
			System.out.println(charProperties(c));
		}
		System.out.println();

		// Method parse:
		String[] numberArray = { "1.1", "2.5", "3.14", "40.04", "5.325", "63.5" };

		String[] wholeNumbers = new String[10];
		for (int i = 0; i < wholeNumbers.length; i++) {
			wholeNumbers[i] = "" + (random.nextInt(90) + 10); // Changed "rand" to "random"
		}

		System.out.println(Arrays.deepToString(numberArray) + " .. sum = " + parseSum(numberArray));

	}

}
