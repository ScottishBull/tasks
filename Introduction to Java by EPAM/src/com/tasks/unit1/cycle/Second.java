/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */

package com.tasks.unit1.cycle;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		float a;
		float b;
		float h;
		float y;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("a ?-> ");
		a = in.nextFloat();
		System.out.print("b ?-> ");
		b = in.nextFloat();
		System.out.print("h ?-> ");
		h = in.nextFloat();
		System.out.printf("\t   x\t\t   y\n");
		while (a <= b) {
			if(a > 2) {
				y = a;
				System.out.printf("\t%f\t%f\n", a, y);
			}else {
				y = - a;
				System.out.printf("\t%f\t%f\n", a, y);
			}
			a += h;
		}

	}

}
