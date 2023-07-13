// 3. Programs on conditionals (if else, switch)

package Assignment_CFS;

import java.util.Scanner;

public class ConditionProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner UI = new Scanner(System.in);
		System.out.println("Do you want to Play");
		String Ans = UI.next();
		
		if(Ans.equals("yes")) {
			System.out.println(" Available Games: Cricket, Football, Kabbadi , Ludo and Chess ");
			System.out.println("Select your game: ");
			String yourGame = UI.next();
		
			switch (yourGame) {
			case "Cricket":
				System.out.println("Outdoor Game");
				break;
				
			case "Football":
				System.out.println("Outdoor Game");
				break;
			
			case "Kabbadi":
				System.out.println("Outdoor Game");
				break;
			
			case "Ludo":
				System.out.println("Indoor Game");
				break;
				
			case "Chess":
				System.out.println("Indoor Game");
				break;	
			
			default:
				System.out.println("This game not available right now");
				break;
			}
		}
		else{
			System.out.println("See you next Time");
		}
	}

}
