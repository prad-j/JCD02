package pkg01;

import java.util.Scanner;

public class If001 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter value of x");
		
		int x=s.nextInt();
		
		if (x>5){
			System.out.println("x is greater than 5");
		}else{
			System.out.println("x is NOT greater than 5");
		}
			
	}
    
}
