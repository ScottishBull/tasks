/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич
 * через отверстие.
 */

package com.tasks.unit1.branching;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		int A;
		int B;
		int x;
		int y;
		int z;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("A ?-> ");
		A = in.nextInt();
		System.out.print("B ?-> ");
		B = in.nextInt();
		System.out.print("x ?-> ");
		x = in.nextInt();
		System.out.print("y ?-> ");
		y = in.nextInt();
		System.out.print("z ?-> ");
		z = in.nextInt();
		if((x < A && y < B) || (x < A && z < B) || 
		   (y < A && x < B) || (y < A && z < B) || 
		   (z < A && x < B) || (z < A && y < B)) {
			System.out.println("The kirpich can go through the hole.");
		} else {
			System.out.println("The kirpich can't go through the hole.");
		}

	}

}
