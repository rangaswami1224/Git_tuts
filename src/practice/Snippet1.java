package practice;

public class Snippet1 {
	public static void main(String args[])
	{
		int m=10, n=12;
		int res=m++ /(++n * n--) /--m;
		System.out.println("res="+res);
	}

}
