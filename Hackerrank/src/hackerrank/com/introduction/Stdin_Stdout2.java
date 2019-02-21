package hackerrank.com.introduction;

import java.util.Scanner;

public class Stdin_Stdout2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Myint = sc.nextInt();
		double Mydouble = sc.nextDouble();
		sc.nextLine();
		String Mystr = sc.nextLine();

		
		sc.close();
		
		System.out.println("String:"+Mystr);
		System.out.println("Double:"+Mydouble);
		System.out.println("Int:"+Myint);
	}

}
