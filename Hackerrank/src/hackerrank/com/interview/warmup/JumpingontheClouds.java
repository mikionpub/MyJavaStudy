package hackerrank.com.interview.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingontheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    	int jumps = 0;
    	int point = 0;
    	
    	for(int i=0; i<c.length; i++) {
    		if((point+2) >= c.length || (point+1) >= c.length) {
    			
    			jumps++;
    			break;
    			
    		} else {
    			if(c[point+2] == 0) {
    				jumps += 2;
    				i++;
    				point += 2;
    			} else if (c[point+1] == 0) {
    				jumps++;
    				point++;
    			}
    		}

    	}
    	
    	return jumps;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int cItem = scanner.nextInt();
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);

        scanner.close();
    }
}
