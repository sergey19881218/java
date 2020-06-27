package ru.stqa.pft.sandbox;

import com.sun.org.apache.xpath.internal.objects.XString;

public class myFirstProgram {

	public static void main(String[] args) {
	    hello("world");
	    hello("User");
	    hello("Alex");
	    double l = 5;
		System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area(double len) {
		return len * len;
	}

}

