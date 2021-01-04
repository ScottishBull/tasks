/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */

package com.tasks.unit1.cycle;

import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		int m;
		int n;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("m ?-> ");
		m = in.nextInt();
		m++;
		System.out.print("n ?-> ");
		n = in.nextInt();
		while(m < n) {
			System.out.print(m + " - ");
			for(int i = 2; i < m; i++) {
				if(m % i == 0) {
					System.out.print(i + " ");
				}
			}
			m++;
			System.out.println();
		}

	}

}
