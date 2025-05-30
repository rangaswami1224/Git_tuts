package practice;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		
		int[] a=new int[5];
		
		for(i=0;i<a.length;i++) {
			System.out.println("Enter "+i);
			a[i]=sc.nextInt();
			
		}
		 System.out.println("You entered:");
	        for (i = 0; i < a.length; i++) {
	            System.out.println("Element " + (i + 1) + ": " + a[i]);
	        }
	}
}
