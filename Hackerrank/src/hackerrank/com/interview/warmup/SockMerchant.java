package hackerrank.com.interview.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {
	
	static int sockMerchant(int n, int[] ar) {
		
		int count = 1;
		int total_count = 0;
		int std = 0;
		Arrays.sort(ar);
		
		for(int i=1; i<n; i++) {
			if(ar[std] == ar[i]) {
				count += 1; 
			} else if (ar[std] != ar[i]){
				std = i;
				total_count += count/2;
				count = 1;
			} 
			
		}
		total_count += count/2;
		return total_count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
 

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println("total is :" + result);

        scanner.close();
    }
	

}
