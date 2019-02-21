package hackerrank.com.introduction;

import java.util.Scanner;

public class if_else {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.close();
		
		if(n>=1 && n<=100) {
			if(n%2 == 0) {
				if(n>=6 && n<=20)
					System.out.println("Weird");
				else
					System.out.println("Not Weird");
			} else
				System.out.println("Weird");
		} 
		
	}

}
