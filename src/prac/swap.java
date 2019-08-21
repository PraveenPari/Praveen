package prac;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		int a,b,c;
		Scanner Sw=new Scanner(System.in);
		System.out.println("The number are");
		a=Sw.nextInt();
		b=Sw.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("swapping numbers are");
		System.out.println(a);
		System.out.println(b);
		
	}

}
