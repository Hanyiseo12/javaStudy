import java.util.Scanner;
import java.io.IOException;
public class HellowWorld {
public static void main(String []arg) throws IOException{
	//2단
	System.out.println("Select a number btw 1 to 9.");
	
	Scanner newVal = new Scanner(System.in);
	int a,b;
	a = newVal.nextInt();

	System.out.println(a+"단");
	
	int increasingVal = 1; 
while(increasingVal<10) {
	System.out.println(a+ " * "+ increasingVal + " = " + a*increasingVal);
	increasingVal++;
}
System.out.println("Select a number btw 1 to 9.");
b = newVal.nextInt();
for(int i = 1; i< 10; i++) {
	System.out.println(b+ " * "+ i + " = " + b*i);
	
}
System.out.println("아무 알파벳이나 입력");
	char lan;
	lan = (char)System.in.read();
	System.out.println(lan);
	
}
}