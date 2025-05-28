package practice;

import java.util.Scanner;

public class pattern {
	public static void main(String args[]) {
		int i;
		int j;

		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
//		for(j=0;j<=5;j++)
//		{
//			for (i=0;i<=5;i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	pattern 1
		
//		for(j=0;j<=5;j++)
//		{
//			for (i=0;i<=5;i++)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//			pattern 2
		
		for(j=0;j<=5;j++)
		{
			for (i=0;i<=5;i++)
			{
				if (i==0 || i==n||j==0||j==n)
				{
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
			
		}
		
		
	}

}
