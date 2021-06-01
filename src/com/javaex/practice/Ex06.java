package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		char[] c = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'a', 'n', 'c', 'i', 'l'};
		
		for(int i=0; i<c.length; i++) {
			if(c[i] == ' ') {
				c[i] = ',';
			}
			System.out.print(c[i]);
		}

	}

}
