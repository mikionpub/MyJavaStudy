package sookim.xyz.num;

import java.util.Scanner;


public class Main {
	
	private int x;
	private int[] y;
	private int temp;
	private Scanner sc;
	
	public int getx() {
		return x;
	}
	
	public int[] gety() {
		return y;
	}
	
	public int gettemp() {
		return temp;
	}
	
	public Scanner getsc() {
		return sc;
	}
	
	public void setx(int x) {
		this.x = x;
	}
	
	public void sety(int[] y) {
		this.y = y;
	}
	
	public void settemp(int temp) {
		this.temp = temp;
	}
	
	public void setsc(Scanner sc) {
		this.sc = sc;
	}

	public int avg() {
		
		Main m = new Main();
		
		int a;
		int sum = 0;
		
		for(int i=0; i<m.x; i++) {
			sum += m.y[i];
			i++;
		}
		
		a = sum / x;
		
		return a;
	}

	public int[] sort() {
		
		Main m = new Main();
		int sort_result[] = new int[m.x];
		
		for (int i=0; i<m.x; i++) {
			for(int j=1; j<m.x; j++) {
				if(i>j) {
					m.temp = m.y[j];
					m.y[j] = m.y[i];
					m.y[i] = m.temp;
				}
			}
		}
		sort_result = m.y;
		return sort_result;
	}
	
	
public static void main(String[] args) {
	
	Main m = new Main();
	
		System.out.println("입력을 원하는 숫자의 개수를 제시 해 주세요: ");
		
		m.sc = new Scanner(System.in);
		m.x = m.sc.nextInt();
		
		System.out.println("입력을 원하는 숫자를 제시 해 주세요: ");
		m.sc = new Scanner(System.in);
		m.y = new int[m.x];
		
		for(int i=0; i<m.x; i++)
			m.y[i] = m.sc.nextInt();
	
		System.out.print("입력하신 숫자는 ");
		for (int e:m.y)
			System.out.print(e+" ");
		System.out.println("입니다.");
	
		
		int avg = m.avg();
		int sort[] = m.sort();
		
		//System.out.println("입력 중 가장 큰 숫자는 "+ sort[m.x-1] +"입니다.");
		//System.out.println("입력 중 가장 작은 숫자는 "+ sort[0] +"입니다.");
		System.out.println("입력의 평균 숫자는 "+ avg +"입니다.");
		System.out.print("입력하신 숫자의 오름차순 정렬입니다 : ");
		for (int e: sort)
			System.out.print(e+" ");
		
	}

}
