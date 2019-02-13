package sookim.xyz.num;

public class student {
	
	private int age;
	private String name, gen, major;
	  
	  //age
	public int getage(){
		return getAge();
	}
	
	public void setage(int age) {
		this.setAge(age);
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
	  		
	    std.setAge(20);
	    std.name = "sookim";
	    std.gen = "F";
	    std.major = "Computer";
	    
	    System.out.println("Your age is : " + std.getAge());
	    System.out.println("Your name is : " + std.name);
	    System.out.println("Your gender is : " + std.gen);
	    System.out.println("Your major is : " + std.major);
	    
	  }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
