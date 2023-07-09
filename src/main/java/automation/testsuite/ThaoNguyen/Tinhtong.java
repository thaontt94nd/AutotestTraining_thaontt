package automation.testsuite.ThaoNguyen;
import java.util.Scanner;

public class Tinhtong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element:");
		n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter element of array:");
		for (int i=0; i<n; i++) {
			System.out.print("Enter the value "+i+":");
			a[i]=sc.nextInt();
		}
		
		System.out.println("\noriginal array:");
		for (int i=0; i<n; i++) {
			System.out.print(a[i]+"\t");
		}
		
		int sum =0;
		for (int i=0; i<n-1;i++) {
			sum = sum +a[i];
		}
		System.out.println("\nSum = "+sum);
	}

}
