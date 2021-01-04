/*
 * Найти сумму квадратов первых ста чисел.
 */

package com.tasks.unit1.cycle;

public class Third {

	public static void main(String[] args) {
		int sum = 1;
		for(int i = 2; i <= 100; i++) {
			sum += Math.pow(i, 2);
		}
		System.out.println("Rez: " + sum);

	}

}
