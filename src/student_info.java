import java.util.Scanner;
import java.io.IOException;
public class student_info {
	
public static void main(String[] args) throws IOException {
	Triangle triangleA = new Triangle(15,8,15,8,3);
	Triangle triangleB = new Triangle(15,8,5,8,6);
	double triangleAArea = triangleA.findArea();
	double triangleBArea = triangleB.findArea();
	System.out.println(triangleAArea);
	System.out.println(triangleBArea);
	}
}