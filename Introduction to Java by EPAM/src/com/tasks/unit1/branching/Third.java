/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

package com.tasks.unit1.branching;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		float x1;
		float y1;
		float x2;
		float y2;
		float x3;
		float y3;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("x1 ?-> ");
		x1 = in.nextFloat();
		System.out.print("y1 ?-> ");
		y1 = in.nextFloat();
		System.out.print("x2 ?-> ");
		x2 = in.nextFloat();
		System.out.print("y2 ?-> ");
		y2 = in.nextFloat();
		System.out.print("x3 ?-> ");
		x3 = in.nextFloat();
		System.out.print("y3 ?-> ");
		y3 = in.nextFloat();
		
		System.out.printf("These points %s on a line",((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))?"are":"are not");

	}

}
