package textProcessing;

/**
 * CS1410 Davis Pessetto 01/27/2026
 * 
 * 
 * 
 */

public class LabStringBuilder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Bats live");
		sb.setCharAt(0, 'r');
		sb.append(" on ");

		StringBuilder tempReverse = new StringBuilder(sb.toString());
		sb.append(tempReverse.reverse());
		System.out.println(sb);

		int doubleSpaceIndex = sb.indexOf("  ");
		sb.deleteCharAt(doubleSpaceIndex);
		sb.append('.').setCharAt(0, 'C');
		System.out.println(sb);

		sb.insert(0, '.');
		StringBuilder sbFinal = new StringBuilder(sb.toString().toLowerCase());
		for (int i = 0; i < sbFinal.length(); i++) {

			if (sbFinal.charAt(i) == ' ') {

				sbFinal.deleteCharAt(i);
				i--;

			}

		}

		StringBuilder reversed = new StringBuilder(sbFinal).reverse();
		boolean isPalindrome = sbFinal.toString().equals(reversed.toString());
				
		System.out.println("sb: " + sbFinal + " isPalindrome: " + isPalindrome);

	}

}
