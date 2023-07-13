//1. find the sum of even digit in a number - scanner  - while loop, Do while loop - 23282

package Assignment_CFS;

import java.util.Scanner;

public class SumEvenNum {

	public static void main(String[] args) {
		Scanner UI = new Scanner(System.in);
		
//		using while loop			 
		
		System.out.println("Enter the number : ");
		int num = UI.nextInt();
		
		int sum = 0;
		int Digit;
		
		while(num > 0) {
			Digit = num%10;
			if(Digit % 2 == 0){
				 sum += Digit;
			}
			num /= 10;
		}
		System.out.println("For While Loop");
		System.out.println("The sum of Even number : " + sum);

//		using do while loop
		
		System.out.println("Enter the number : ");
		int number = UI.nextInt();
		
		int total = 0;
		int lastDigit;
		
		do {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
            	total += lastDigit;
            }
            number /= 10;
        } 
		while (number > 0);
        System.out.println("For Do-While Loop");
        System.out.println("The sum of Even number : " + total);
	}	
}
