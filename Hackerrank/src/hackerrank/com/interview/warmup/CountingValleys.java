package hackerrank.com.interview.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {
	
	 static int countingValleys(int n, String[] s) {
		 
		 int steps = 1;
		 String U = "U";
		 String D = "D";

		 
		 for(int i=0; i<n; i++) {
			 if(s[i].equals(U)) 
				 steps += 1;
			 else if(s[i].equals(D)) 
				 steps += -1;

		 }
		 
		 return steps;

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String[] s = scanner.nextLine().split("");

	        int result = countingValleys(n, s);
	        System.out.println(result);

	        scanner.close();
	    }

}
