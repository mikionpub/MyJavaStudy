package hackerrank.com.introduction;

import java.util.Scanner;

public class EndofFile {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		while(sc.hasNext()) {
			String input = sc.nextLine();
			System.out.println(i +" "+ input);
			i++;
		}
		
		sc.close();
	}

}
