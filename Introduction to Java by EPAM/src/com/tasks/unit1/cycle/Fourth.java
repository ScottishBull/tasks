/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

package com.tasks.unit1.cycle;

public class Fourth {

	public static void main(String[] args) {
		int a;
		
		String obj = new String();
		
		for(int i = 1; i <= 200; i++) {
			a = i * i;
			obj += Integer.toString(a);
		}
		System.out.println("Rez: " + obj);

	}

}
