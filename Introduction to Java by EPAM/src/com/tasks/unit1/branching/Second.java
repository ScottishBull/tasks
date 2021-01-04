/*
 *  Найти max{min(a, b), min(c, d)}
 */

package com.tasks.unit1.branching;

import java.text.NumberFormat;
import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		float a;
		float b;
		float c;
		float d;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("a ?-> ");
		a = in.nextFloat();
		System.out.print("b ?-> ");
		b = in.nextFloat();
		System.out.print("c ?-> ");
		c = in.nextFloat();
		System.out.print("d ?-> ");
		d = in.nextFloat();
		System.out.printf("max{min(%s,%s), min(%s,%s)} = %s", format(a), format(b), format(c), format(d), format(max(min(a,b),min(c,d))));

	}
	
	public static float min(float a, float b) {
		return (a > b) ? b : a;
	}
	
	public static float max(float a, float b) {
		return (a > b) ? a : b;
	}
	
	private static String format ( float value )
    {
        return NumberFormat.getInstance ().format ( value ) ;
    }

}
