package labCollection;

import java.util.ArrayList;

public class Warmup {

	public static void main(String[] ars) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int e = 2; e <= 50; e += 2) {

			numbers.add(e);

		}
		// System.out.println(numbers);
		for (int i : numbers) {
			System.out.printf("#%d ", numbers.get(i - 2));
			System.out.println(i);
		}

	}

}
