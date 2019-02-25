package hackerrank.com.introduction;

import java.util.Scanner;

public class StaticInitializerBlock {
	
	 static Scanner sc = new Scanner(System.in);
	    static int B = sc.nextInt();
	    static int H = sc.nextInt();
	    static boolean flag = true;

	    static{
	        
	        try{
	            if(B<=0 || H<=0){
	                flag = false; 
	                Exception e = new Exception("Breadth and height must be positive");
	                throw e;
	                 }
	                 }catch(Exception e) {
	                      System.out.println(e);
	                      }
	    }
	    
	   public static void main(String[] args) {
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
	   }//end of main

}
