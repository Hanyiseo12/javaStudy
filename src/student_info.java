import java.util.Scanner;
import java.io.IOException;
public class student_info {
	
	
public static void main(String[] args) throws IOException {
	studentsInfo studentA = new studentsInfo("Hanyi","SEO",2025,4.21,"Computer Science");
	studentsInfo studentB = new studentsInfo("Wonyi","SEO",2028,4.33,"Computer Science and management");
	
	studentA.checkingYear();
	System.out.println(studentA.graduateYear);
	studentB.checkingYear();
	System.out.println(studentB.graduateYear);
	}
}