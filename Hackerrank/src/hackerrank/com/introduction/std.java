package hackerrank.com.introduction;

import java.util.Scanner;

public class std {

	public static void main(String[] args) {

		int result[] = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			
			result[i] = sc.nextInt();
			
		}

		sc.close();

		for(int e:result)
			System.out.println(e);

	}
}
