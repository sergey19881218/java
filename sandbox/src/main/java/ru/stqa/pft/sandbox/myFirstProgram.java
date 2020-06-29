package ru.stqa.pft.sandbox;

import com.sun.org.apache.xpath.internal.objects.XString;

public class myFirstProgram {

	public static void main(String[] args) {
	    hello("world");
	    hello("User");
	    hello("Alex");
	    Square s = new Square(5);
	    //s.l = 5;
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
		Rectangle r = new Rectangle(4,6);

		//r.a = 4;
		//r.b = 6;
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	//public static double area(Square s) {
	//	return s.l * s.l;
	//}



}

