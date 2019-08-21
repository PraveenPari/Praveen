package prac;

import java.util.Scanner;

public class palindrome {
	public static Scanner an;

	public static void main(String[] args) {
		int n,a,i=0,j=0;
		an = new Scanner(System.in);
		System.out.println("enter a number");
		n=an.nextInt();
		a=n;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		if(n==j){
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
