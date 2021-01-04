/**
 *  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами 
 *  дробную и целую части числа и вывести полученное значение числа.
 */

package com.tasks.unit1.linear;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		float inputNumber;
		int i1;
		int i2;
		float outputNumber;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a floating-point number ?-> ");
		inputNumber = input.nextFloat();
		i1 = (int)inputNumber;
		inputNumber += 0.0001;
		outputNumber = inputNumber % 1 * 1000;
		i2 = (int)outputNumber;
		System.out.printf("Output: %d%d%d.%d%d%d", i2/100, i2/10%10, i2%10, i1/100, i1/10%10, i1%10);

	}

}
