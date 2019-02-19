package warmup;

import java.util.Scanner;

public class MercifulAlgospot {
	
	private int N;
	private Scanner sc;
	
	public static void main(String[] args) {
		
		MercifulAlgospot c = new MercifulAlgospot();
		c.sc = new Scanner(System.in);
		c.N = c.sc.nextInt();
		
		for(int i=0; i<c.N; i++) {
			System.out.println("Hello Algospot!");
		}
		
	}

}
