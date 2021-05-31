package com.javaex.practice;

public class Q {

	public static void main(String[] args) {
		int a = 10;
		int b;
		
		b = a;
		b = 20;
		
		System.out.println("a는 "+a);
		System.out.println("b는 "+b);
		System.out.println("================");
		
		int[] intA = {3, 6, 9};
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		intA[1] = 15;
		
		System.out.println("intA[0]는 "+intA[0]);
		System.out.println("intA[1]는 "+intA[1]);
		System.out.println("intA[2]는 "+intA[2]);
		System.out.println("================");
		System.out.println("intB[0]는 "+intB[0]);
		System.out.println("intB[1]는 "+intB[1]);
		System.out.println("intB[2]는 "+intB[2]);
		System.out.println("================");
		
		System.out.println("슨생님 b에 a를 대입하고 b를 수정했을때 a는 변하지않는데");
		System.out.println("intB에 intA를 대입하고 intB를 수정하니 intA값도 변했는데 왜 그런가요??");
		System.out.println("intB 에 intA를 대입할때 주소도 같이 대입되어 intB와 intA는 같은 주소를 사용하나요?");
		
	}

}
