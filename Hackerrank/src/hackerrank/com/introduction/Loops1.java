package hackerrank.com.introduction;

import java.util.Scanner;

public class Loops1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N>=2&&N<=20) {
			for(int i=1; i<11; i++) {
				System.out.println(N+" x "+i+" = "+N*i);
			}
		}
		
		sc.close();
		
	}

}
