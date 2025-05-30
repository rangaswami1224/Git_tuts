package practice;
class method3{
	
	int add(int a,int b) {
		int c=a+b;
		System.out.println("the sum is "+c);
		return c;
	}
	
	
}

public class InOutMethod {

	public static void main(String[] args) {
		method3 m=new method3();
		int res=m.add(45,67);
		System.out.println(res);
		

	}

}
