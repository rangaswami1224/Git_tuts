package practice;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int[][][] a=new int[2][3][5];
		Scanner sc=new Scanner(System.in);
		int i,j,k;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				for(k=0;k<a[i][j].length;k++) {
					System.out.println("Enter i= "+i+" , j= "+j+" ,k= "+k);
					a[i][j][k]=sc.nextInt();
					
				}
				
			}
			
		}
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				for(k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]);
					
				}	
				System.out.println();
			}
			System.out.println();
		}	
	}

}
