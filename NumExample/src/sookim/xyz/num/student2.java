package sookim.xyz.num;

import java.util.Scanner;

public class student2 {
	
	private String age;
	private String name, gen, major;
	  
	  //age
	public String getage(){
		return age;
	}
	
	public void setage(String age) {
		this.age = age;
	}
	
	// name
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	//gen
	public String getgen() {
		return gen;
	}
	public void setgen(String gen) {
		this.gen = gen;
	}
	
	//major
	public String getmajor() {
		return major;
	}
	public void setmajor(String major) {
		this.major = major;
	}
	
	
	public void io() {
		
		student2 std = new student2();
  		
		System.out.println("나이를 입력 해 주세요 ");
		Scanner sc1 = new Scanner(System.in);
		std.age = sc1.next();
		
		System.out.println("성함을 입력 해 주세요 ");
		Scanner sc2 = new Scanner(System.in);
		std.name = sc2.next();
		
		System.out.println("성별을 입력 해 주세요 ");
		Scanner sc3 = new Scanner(System.in);
		std.gen = sc3.next();
		
		System.out.println("전공을 입력 해 주세요 ");
		Scanner sc4 = new Scanner(System.in);
		std.major = sc4.next();
		
		System.out.println("Your age is : " + std.age);
	    System.out.println("Your name is : " + std.name);
	    System.out.println("Your gender is : " + std.gen);
	    System.out.println("Your major is : " + std.major);
	    
	    sc1.close();
	    sc2.close();
	    sc3.close();
	    sc4.close();

	}
	
	public static void main(String[] args){
		
		student2 std = new student2();
		
		std.io();
	
	    
	  }


}
