package Task_String;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner UI = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = UI.nextLine();

		String revString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revString = revString + str.charAt(i);
		}
		
		System.err.println(revString);

	}

}
















//
//import java.util.Scanner;
//
//public class Reverse_String {
//    public static void main(String[] args) {
//        Scanner UI = new Scanner(System.in);
//        int[] arr = new int[40];
//        int num, temp, i, j;
//       
//        System.out.print("Please enter the total number you want to enter: ");
//        num = UI.nextInt();
//       
//        for (i = 0; i < num; i++) {
//            System.out.print("Enter the element " + (i + 1) + ": ");
//            arr[i] = UI.nextInt();
//        }
//       
//        for (i = 0, j = num - 1; i < num / 2; i++, j--) {
//            temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//       
//        System.out.println("Reverse all elements of the array:");
//        for (i = 0; i < num; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}
