package sookim.xyz.num;

import java.util.Scanner;

class input{
	
	static int x;
	
	private static Scanner sc;
	private static Scanner sc1;
	
	public static int first(){
		
		sc = new Scanner(System.in);
		x = sc.nextInt();
		// x에 입력받을 숫자의 갯수 저장
		
		return x;
		
	}
	
	public static int[] second(){
		
		int[] y = new int[x];
		
		for(int i=0; i<x; i++) {
			
			sc1 = new Scanner(System.in);
			y[i] = sc1.nextInt();
			System.out.println(y[i]);
			i++;
			
		}
		
		return y;
		
	}
}

class jobs{
	
	input.getERDF();
	
	public static int max(){
		
		int a=0;
		
		for(int i=0; i<input.x; i++) {
			
			if (a<input.y[i])
				a = input.y[i];
			
			i++;
		}
			
		return a;
	}
	
	public static int min(){
		
		int a=1000;
		
		for(int i=0; i<input.x; i++) {
			
			if (a>input.y[i])
				a = input.y[i];
			
			i++;
		}
			
		return a;
	}
	
	public static int avg() {
		
		int a;
		int sum=0;
		
		for(int i=0; i<input.x; i++) {
			sum += input.y[i];
			i++;
		}
		
		a = sum/input.x;
		
		return a;
		
	}
	
	public static int[] sort() {
		
		int temp;
		
		for (int i=1; i<input.x; i++) {
			for(int y=1; y<input.x; y++) {
				if(input.y[i]<input.y[i-y]) {
					temp = input.y[i];
					input.y[i] = input.y[i-y];
					input.y[i-y] = temp;
				}
					
			}
			
		}
		
		return input.y;
		
	}
	

}



public class number {
	
	public static void main(String[] args) {
		
		System.out.println("입력을 원하는 숫자의 개수를 제시 해 주세요: ");
		input.first();
		System.out.println("입력을 원하는 숫자를 제시 해 주세요: ");
		input.second();
		
		System.out.println("입력 중 가장 큰 숫자는 "+ jobs.max() +"입니다.");
		System.out.println("입력 중 가장 작은 숫자는 "+ jobs.min() +"입니다.");
		System.out.println("입력의 평균 숫자는 "+ jobs.avg() +"입니다.");
		System.out.println("입력의 오름차순 정렬입니다 : ");
		for(int e : input.y) {
			System.out.println(e);
		}
		
		
	}

}
