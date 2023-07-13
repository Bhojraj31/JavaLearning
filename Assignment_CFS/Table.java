//2. Write a program to print the tables -  10 values (12 x 1 = 12)

package Assignment_CFS;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner UI = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int tableNum = UI.nextInt();
		
		System.out.println("Your Table Number : ");
		int num;
		
		for(int i = 1; i <= 10; i++){
			num = tableNum * i;
			System.out.println(tableNum + " * " + i + " " + " = " + num);
		}
	}

}
