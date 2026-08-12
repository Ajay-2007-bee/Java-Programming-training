package javabasics;
import java.util.*;
public class Palindrome {
	public static boolean palin(int n ) {
		int og = n;
		int reversed = 0;
		while(n>0) {
			int digit = n%10;
			reversed = (reversed*10) + digit;
			n/=10;
		}
		if(og==reversed) return true;
		else return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
		System.out.print("enter the number:");
		int n = s.nextInt();
		if(palin(n)) System.out.print(" palindrome");
		else System.out.print(" not a palindrome");
		}
		catch(InputMismatchException e) {
			
			System.out.print("give input in int : " + e);
		}
	    s.close();
	}

}
