package prac;

import java.util.Scanner;

public class stundentgrade {
	public static void main(String[] args) {
		Scanner sm = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			if(i==3) {
				continue;
			}
			System.out.println("Enter the value");
			int n = sm.nextInt();
			if (100 >= n && n >= 90) {
				System.out.println("s grade");
			}
			else if (89 >= n && n >= 80) {
				System.out.println("A grade");
			}
			else if (79 >= n && n >= 70) {
				System.out.println("b grade");
			} 
			else if (69 >= n && n >= 60) {
				System.out.println("A grade");
			} 
			else if (89 >= n) {
				System.out.println("Fail");
			}
		}
	}
}
