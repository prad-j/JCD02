package pkg01;

import java.util.Scanner;

public class Switch03 {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the item number-");
		char it=s.next().charAt(0);
		
		switch (it){
		case '1':
			System.out.println("Chees Burger - 10");
			break;
		case '2':
			System.out.println("Chicken Burger - 12");
			break;
		case '3':
			System.out.println("Pizza - 8");
			break;
		case '4':
			System.out.println("Chees Pizza - 11");
			break;
		case '5':
			System.out.println("Chicken Pizza - 13");
			break;
		case '6':
			System.out.println("Pasta  - 7");
			break;
		case '7':
			System.out.println("Noodles - 5");
			break;
		default:
			System.out.println("Invalid entry");
			
		}
	}

}
