/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
 * он прямоугольным.
 */

package com.tasks.unit1.branching;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		float a1;
		float a2;
		float a3;
		
		Scanner in = new Scanner(System.in);
		System.out.print("angle 1 ?-> ");
		a1 = in.nextFloat();
		System.out.print("angle 2 ?-> ");
		a2 = in.nextFloat();
		a3 = 180 - a1 - a2;
		if(a1 + a2 + a3 == 180) {
			System.out.println("Exist");
			if(a1 == 90 || a2 == 90 || a1 + a2 == 90)
				System.out.println("Triangle is right triangle");
			else
				System.out.println("Triangle is not right tiangle");
		} else {
			System.out.println("not Exist");
		}
			

	}

}
