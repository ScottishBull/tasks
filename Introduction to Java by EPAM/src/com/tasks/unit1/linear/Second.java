/**
 *  Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */

package com.tasks.unit1.linear;

import java.util.Scanner;

public class Second {

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
		z = (b+Math.sqrt(Math.pow(b, 2)+4*a*c))/2/a-Math.pow(a, 3)*c+Math.pow(b,-2);
		System.out.println("Rez:" + z);

	}

}
