/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
 */

package com.tasks.unit1.cycle;

public class Sixth {

	public static void main(String[] args) {
		for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }

	}

}
