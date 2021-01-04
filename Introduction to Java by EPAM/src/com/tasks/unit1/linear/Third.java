/**
 *  Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */

package com.tasks.unit1.linear;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		double z;
		
		float x;
		float y;
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("x ?-> ");
		x = a.nextFloat();
		System.out.print("y ?-> ");
		y = a.nextFloat();
		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(y * x);
		System.out.println("Rez: " + z);

	}

}
