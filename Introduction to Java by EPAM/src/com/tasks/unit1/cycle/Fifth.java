/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е.
 */

package com.tasks.unit1.cycle;

import java.util.Scanner;

public class Fifth {
	
	static int counter;
	static double sum;
	
	public static void main(String[] args) {
		float e;
		
		double a;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("e ?-> ");
		e = in.nextFloat();
		for(int i = 0; i < 700; i++) {
			a = 1./Math.pow(2, i) + 1./Math.pow(3, i);
			if(Math.abs(a) >= e) {
				counter++;
				sum += a;
				System.out.println(a);
				System.out.println(i);
				
			}
			if(counter == 3)
				break;
		}
		System.out.println("Rez: " + sum);

	}

}
