package practice;

import java.util.Scanner;

public class Array2 {
	public static void main(String args[]) {
		int[][] a=new int[2][5];
		Scanner sc=new Scanner(System.in);
		int i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				
				System.out.println("Enter i="+i+", j="+j);
				a[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("The two dimensional array is");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				
				System.out.print(a[i][j]);
				
				
			}
			System.out.println();
			
		}
		
	}

}
