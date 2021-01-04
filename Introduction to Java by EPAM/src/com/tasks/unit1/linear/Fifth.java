/**
 *  Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 *  данное значение длительности в часах, минутах и секундах в следующей форме:
 *  ННч ММмин SSc
 */

package com.tasks.unit1.linear;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		int T;
		int h, m, s;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("T ?-> ");
		T = in.nextInt();
		h = T / 3600;
		m = (T - h * 3600) / 60;
		s = T - h * 3600 - m * 60;
		System.out.printf("%dч %dмин %dс", h, m, s);

	}

}
