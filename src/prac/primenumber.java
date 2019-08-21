package prac;

import java.util.Scanner;

public class primenumber {
public static void main(String[] args) {
	int n;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number");
	n=in.nextInt();
	int count=0;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0)
		{
			count=1;
		}
	}
		if (count==0) {
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}




