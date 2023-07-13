package Task_String;

import java.util.Scanner;

public class Palindom_String {

	public static String isPalindrome(String S) {
		StringBuilder P = new StringBuilder(S);
		P.reverse();

		if (S.equals(P.toString())) {
			return "Is palindrom";
		} else {
			return "it's not palindrom";
		}
	}

	public static void main(String[] args) {
		Scanner UI = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String S = UI.nextLine();
		System.out.println(isPalindrome(S));

		UI.close();
	}
}
