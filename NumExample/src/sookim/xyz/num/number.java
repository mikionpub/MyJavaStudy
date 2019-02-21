package sookim.xyz.num;

import java.util.Scanner;

public class number {
	
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
		return getSc();
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
		this.setSc(sc);
	}

	public int avg() {
		
		number n = new number();
		
		int a;
		int sum = 0;
		
		for(int i=0; i<n.x; i++) {
			sum += n.y[i];
			i++;
		}
		
		a = sum / x;
		
		return a;
		
	}

	public void sort() {
		
		number n = new number();
		
		for (int i=0; i<n.x; i++) {
			for(int j=1; j<n.x; j++) {
				if(i>j) {
					n.temp = n.y[j];
					n.y[j] = n.y[i];
					n.y[i] = n.temp;
				}
			}
		}
		
		
		
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}	

}
