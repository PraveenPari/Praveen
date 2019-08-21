package prac;

import java.util.Scanner;

public class evenorodd {
	public static void main(String[] args) {
		Scanner e=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n =e.nextInt();
		if(n%2==0) {
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("ODD NUMBER");
		}
	}


}
