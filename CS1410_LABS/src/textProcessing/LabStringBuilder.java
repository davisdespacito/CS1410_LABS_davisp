package textProcessing;


/** 
 * CS1410
 * Davis Pessetto
 * 01/27/2026
 * 
 * 
 * 
 * */

public class LabStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Bats live");
		sb.setCharAt(0, 'r');
		sb.append(" on ");
		System.out.printf("Output: %s%n", sb);
		
		StringBuilder temp = new StringBuilder(sb);
		sb.append(temp.reverse());
		System.out.printf("New sb: %s%n", sb);
		

	}

}
