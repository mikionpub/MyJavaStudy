package sookim.xyz.num;

import java.util.Scanner;

public class Main {
	
	
public static void main(String[] args) {
	
		number n = new number();
	
		System.out.println("입력을 원하는 숫자의 개수를 제시 해 주세요: ");
		Scanner sc = new Scanner(System.in);
		n.x = sc.nextInt();
		
		System.out.println("입력을 원하는 숫자를 제시 해 주세요: ");

		int[] y = new int[x];
		Scanner sc2;
		
		for(int i=0; i<x; i++) {
			
			sc2 = new Scanner(System.in);
			y[i] = sc2.nextInt();
	
			//i+=1;
		}
		
		System.out.print("입력하신 숫자는 ");
		for (int e: y)
			System.out.print(e+" ");
		System.out.println("입니다.");
	
		

		n.sort(x, y);
		n.avg(x, y);
		
		System.out.println("입력 중 가장 큰 숫자는 "+ n.y[n.x-1] +"입니다.");
		System.out.println("입력 중 가장 작은 숫자는 "+ y[0] +"입니다.");
		System.out.println("입력의 평균 숫자는 "+ n.avg(x, y) +"입니다.");
		System.out.print("입력하신 숫자의 오름차순 정렬입니다 : ");
		for (int e: y)
			System.out.print(e+" ");
		
	}

}
