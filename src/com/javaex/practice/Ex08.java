package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		int [] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			int num = (int)(Math.random()*45)+1;
			for(int j = 0; j<lotto.length; j++) {
				if(num == lotto[j]) {
					//System.out.print("num은" + num + "\t"); //중복test
					num = (int)(Math.random()*45)+1;
				}
			}
			lotto[i] = num;
			System.out.print(lotto[i] + "\t");
		}
		

	}

}
