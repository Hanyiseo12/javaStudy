package oop;


public class Tree {
	String name; 
	int age,
	TreeType salary;
	static String location = "SEOUL";
	
	 Tree(String name, int age, TreeType salary){
		 this name = name;
		 this age = age;
		 this salary = salary;
	 }
	 
	 void raiseSalary() {
		 if(this.salary < 30000) {
			 this.salary = this.salary + 5000;
		 }
		 return this.salary;
	 }
}
