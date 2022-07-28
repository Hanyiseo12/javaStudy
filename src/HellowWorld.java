import java.util.Scanner;
import java.io.IOException;
public class HellowWorld {
public static int[] calc(int number) {
	int[] arr = new int[9];
	for(int i = 0 ; i<arr.length;i++) {
		arr[i] = number*(1+i);
	}
	return arr;
}
public static void print(int[] arr) {
	for(int i =0;i<arr.length;i++) {
		System.out.println("값은 " + arr[i] );
	}
}
	

//	Scanner newVal = new Scanner(System.in);
//	int a,b;
//	a = newVal.nextInt();
//	if(a>1&&a<10) {
//		System.out.println(a+"단");
//		
//		int increasingVal = 1; 
//	while(increasingVal<10) {
//		System.out.println(a+ " * "+ increasingVal + " = " + a*increasingVal);
//		increasingVal++;
//		}
//	}else {
//		System.out.println("잘못된 값 입력");
//	}
//	
//	System.out.println("Select a number btw 1 to 9.");
//	b = newVal.nextInt();
//	if(b>1&b<10) {
//	for(int i = 1; i< 10; i++) {
//		System.out.println(b+ " * "+ i + " = " + b*i);
//		}
//	}else {
//		System.out.println("잘못된 값 입력");
//	}
//	
//	System.out.println("아무 알파벳이나 입력");
//		char lan;
//		lan = (char)System.in.read();
//		System.out.println(lan);
		
	}

