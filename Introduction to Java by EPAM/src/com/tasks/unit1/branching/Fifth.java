/*
 *  Вычислить значение функции
 */

package com.tasks.unit1.branching;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		float x;
		double y;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("x ?-> ");
		x = in.nextFloat();
		
		if(x <= 3) {
			y = Math.pow(x, 2) - 3 * x + 9;
		} else {
			y = 1. / (Math.pow(x, 3) + 6);
		}
		System.out.println("f(x) = " + y);

	}

}
