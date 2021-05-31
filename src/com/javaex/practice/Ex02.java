package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		double[] num = {1.2, 3.3, 6.7};
		
		/*
		for(int i=2, j=0; j<num.length; i--, j++) {
			System.out.println(num[i]);
		}
		*/
		//System.out.println(num.length);
		//System.out.println(num[0]);
		
		for(int i=2; i<num.length; i--) {
			if(i<0) {
				break;
			}else {
				System.out.println(num[i]);
			}
		}

	}

}
