/*
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 */

package com.tasks.unit1.cycle;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		int number;
		int sum = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number ?-> ");
		number = in.nextInt();
		for(int i = 1; i <= number; i++) {
			sum += i;
		}
		System.out.println("Rez: " + sum);

	}

}
