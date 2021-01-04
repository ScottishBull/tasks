/**
 *  Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 *  принадлежит закрашенной области, и false — в противном случае: 
 */

package com.tasks.unit1.linear;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		float x;
		float y;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("x ?-> ");
		x = in.nextFloat();
		System.out.print("y ?-> ");
		y = in.nextFloat();
		System.out.println((y<=4 && y>=0 && Math.abs(x)<=2) || (y>=-3 && y<=0 && Math.abs(x)<=4) ? "true" : "false");

	}

}
