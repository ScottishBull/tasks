/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

package com.tasks.unit1.cycle;

public class Eighth {

	public static void main(String[] args) {
		int[] arr = new int[10];
        int a = 495300236;
        while(a != 0){
            arr[a % 10]++;
            a /=10;
        }
        int b = 590;
        while(b != 0){
            if(arr[b % 10] != 0)
                System.out.println(b % 10);
            b /=10;
        }
        System.out.println();
        int c = 923;
        while(c != 0){
            if(arr[c % 10] != 0)
                System.out.println(c % 10);
            c /=10;
        }

	}

}
