package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] data = new int[5];
		
		int sum = 0;
		
		for(int i = 0; i<data.length; i++) {
			System.out.print("");
			data[i] = sc.nextInt();
			sum += data[i];
		}
		
		System.out.println("평균은 " + (sum/data.length) + " 입니다.");
		
		System.out.println("====================");
		System.out.println(sum);
		System.out.println(data.length);
		
		sc.close();

	}

}
