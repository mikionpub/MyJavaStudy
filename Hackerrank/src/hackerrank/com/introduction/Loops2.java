package hackerrank.com.introduction;

import java.util.Scanner;

public class Loops2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		int a, b, n;
		
        for(int i=0;i<t;i++){
        	System.out.println("Input a: ");
    		a = sc.nextInt();
    		System.out.println("Input b: ");
    		b = sc.nextInt();
    		System.out.println("Input n: ");
    		n = sc.nextInt();
    		
    		int tempAnswer = 0; 
    		for (int j = 0; j < n; j++) { 
    			tempAnswer += (Math.pow(2, j) * b); 
    			System.out.print(tempAnswer + a + " "); 
    			}
    		System.out.println();
        }

		sc.close();
		
	}

}
