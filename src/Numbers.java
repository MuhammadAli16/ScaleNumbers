import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		System.out.println("ENTER A NUMBER PLS");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();

		printYolo(stringToList(num));
		sc.close();
	}

	public static ArrayList<ArrayList<String>> stringToList(long x) {

		String numStr = Long.toString(x);
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arrLong = new ArrayList<String>();

		String arrWord[] = { "", "thousand", "million", "billion", "trillion", "quadrillion", "quintillion" };
		String arrWordLong[] = { "", "thousand", "million", "milliard", "billion", "billiard", "trillion" };

		float howManyTimes = numStr.length() / 3f;

		for (int i = 0; i < (howManyTimes); i++) {

			if (numStr.length() > 3) {
				arr.add(numStr.substring(numStr.length() - 3) + " " + arrWord[i]);
				arrLong.add(numStr.substring(numStr.length() - 3) + " " + arrWordLong[i]);
				numStr = numStr.substring(0, numStr.length() - 3);
			} else {
				arr.add(numStr + " " + arrWord[i]);
				arrLong.add(numStr + " " + arrWordLong[i]);
			}

		}

		ArrayList<ArrayList<String>> lol = new ArrayList<>();
		lol.add(arr);
		lol.add(arrLong);

		return lol;

	}

	public static void printYolo(ArrayList<ArrayList<String>> arr) {

		for (int x = 0; x < arr.size(); x++) {

			for (int j = arr.get(x).size() - 1; j >= 0; j--) {
				if (j == 0 && arr.get(x).size() > 1) {
					System.out.print("and " + arr.get(x).get(j));
				} else if (j == 0) {
					System.out.print(arr.get(x).get(j));
				} else if (arr.get(x).get(j) != null) {
					System.out.print(arr.get(x).get(j) + ", ");
				}
			}
			System.out.println();
		}

	}

}
