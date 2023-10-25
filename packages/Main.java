// A java package is a group of similar types of classes, interfaces and sub-packages.

// Package in java can be categorized in two form, built-in package and user-defined package.
// There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

// Advantages of Java Package:
// 1. Java package is used to categorize the classes and interfaces so that they can be easily maintained.
// 2. Java package provides access protection.
// 3. Java package removes naming collision.

// Importing custom packages
import MyPackage.Arithmetic;
import MyPackage.Welcome;

public class Main{
	public static void main(String[] args) {
		/*Arithmetic obj = new Arithmetic();
		int x1 = obj.add(6,78);
		int x2 = obj.sub(569,431);
		int x3 = obj.mul(7,7);
		double x4 = obj.div(4,3);

		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);*/

		Welcome obj = new Welcome();
		obj.askName();
		obj.greet();
	}
}