public class Triangle {
	static int numOfSides = 3; // static은 변하지 않는 instance variable 
double base; // non-static은 변할 수 있는 instance variable
double height;
double sideLen1;
double sideLen2;
double sideLen3;

public Triangle(double base, double height, double sideLen1, double sideLen2, double sideLen3) {
	this.base = base;
	this.height = height;
	this.sideLen1 = sideLen1;
	this.sideLen2 = sideLen2;
	this.sideLen3 = sideLen3;
	}

public double findArea() { //instance(non-static) method vs Class(static) Method --> .charAt() 같은 method는 instance method이며 Math.pow()는 class method 
	return (this.base * this.height) / 2;
}
}
