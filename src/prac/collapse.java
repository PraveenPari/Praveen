package prac;

import java.util.Scanner;

public class collapse {
	public static void main(String[] args) {
		System.out.println("Text");
		Scanner d=new Scanner(System.in);
		String a=d.nextLine();
		System.out.println("posi");
		int b = d.nextInt();
		char fi=a.charAt(0);
		b--;
		a=a.substring(b);
		String m=a+fi;
		System.out.println(m);
	}
	

}
