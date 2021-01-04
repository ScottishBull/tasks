/**
 * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
 */

package com.tasks.unit1.linear;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		double z;
		float a;
		float b;
		float c;
		
		Scanner x = new Scanner(System.in);
		
		System.out.print("a ?-> ");
		a = x.nextFloat();
		System.out.print("b ?-> ");
		b = x.nextFloat();
		System.out.print("c ?-> ");
		c = x.nextFloat();
		z = (a-3)*b/2.F+c;
		System.out.print(z);
		
	}

}

