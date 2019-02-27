package hackerrank.com.interview.warmup;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
	
	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	
    	char first;
    	first = s.charAt(0);
    	
    	int count = 0;
    	long[] fill = new long[n];
    	
    	for(int i=1; i<n; i++) {
    		if(first == s.charAt(i)) count++;
    	}
    	
    	long result = ((n / s.length()) * count) + (n % s.length());
    	return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);


        scanner.close();
    }

}
