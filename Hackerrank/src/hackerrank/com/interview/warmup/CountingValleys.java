package hackerrank.com.interview.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {
	
	 static int countingValleys(int n, String s) {
		 
		 int steps = 0;
		 int depth = 0;
		 
		for(char c : s.toCharArray()) {
			if(c == 'U') ++depth;
			if(c == 'D') --depth;
			
			if(depth == 0 && c == 'U')
				steps++;
		}
		
		return steps;
	 }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String s = scanner.nextLine();

	        int result = countingValleys(n, s);
	        System.out.println(result);

	        scanner.close();
	    }

}
