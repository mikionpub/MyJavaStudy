package hackerrank.com.thirtydays;

import java.util.Scanner;

public class day2_Operators {
	
	 static void solve(double meal_cost, int tip_percent, int tax_percent) {

	        long totalCost;

	        double tip = meal_cost * (tip_percent/100);
	        System.out.println("tip is " + tip);
	        double tax = meal_cost * (tax_percent/100);
	        System.out.println("tax is " + tax);

	        totalCost = Math.round(meal_cost+tip+tax);
	        System.out.println(totalCost);
	 }
	 
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        double meal_cost = scanner.nextDouble();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tip_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tax_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        solve(meal_cost, tip_percent, tax_percent);

	        scanner.close();
	    }


}