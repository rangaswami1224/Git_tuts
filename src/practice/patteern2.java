package practice;

public class patteern2
{
	public static void main(String args[])
	{
		int i;
		int j;
		int count=1;
		
		for(j=1;j<=5;j++)
		{
			for (i=1;i<=5;i++)
			{
				if(count<10)
				{
					System.out.print("0"+count+" ");
				}
				else {
				System.out.print(count+" ");
				
				}
				count++;
			}
			System.out.println();
				
			
		}
		
		
	}

}
