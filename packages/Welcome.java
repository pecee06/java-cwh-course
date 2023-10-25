package MyPackage;

import java.util.Scanner;

public class Welcome{
	String name;
	public void askName(){
		Scanner sc = new Scanner(System.in);
		System.out.print("What's your name : ");
		this.name = sc.next();
		sc.close();
	}

	public void greet(){
		System.out.printf("Hi %s, good evening",name);
	}
}