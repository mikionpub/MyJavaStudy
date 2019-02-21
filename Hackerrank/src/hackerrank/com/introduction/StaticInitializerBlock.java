package hackerrank.com.introduction;

import java.util.Scanner;

public class StaticInitializerBlock {
	
	 static Scanner sc = new Scanner(System.in);
	    static int B = sc.nextInt();
	    static int H = sc.nextInt();
	    static boolean flag = false;

	    /*
	    static{
	        try{
	            if (B>=0 || H>=0) {
	            	flag = true;
	            } 
	            
	        }
	        catch(Exception e){
	            System.out.println("Breadth and height must be positive");
	        }
	    }
*/	static {
	    if(B>=0 && H>=0) {
	    	flag = true;
	    }else {
	    	 System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
}
	    
	   public static void main(String[] args) {
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
	   }//end of main

}
