package sookim.xyz.num;

public class student {
	
	private int age;
	private String name, gen, major;
	  
	  //age
	public int getage(){
		return age;
	}
	
	public void setage(int age) {
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
	
	public static void main(String[] args){
		
		student std = new student();
	  		
	    std.age = 20;
	    std.name = "sookim";
	    std.gen = "F";
	    std.major = "Computer";
	    
	    System.out.println("Your age is : " + std.age);
	    System.out.println("Your name is : " + std.name);
	    System.out.println("Your gender is : " + std.gen);
	    System.out.println("Your major is : " + std.major);
	    
	  }

}
