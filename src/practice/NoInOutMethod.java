package practice;

class method1{
	int a=30;
	int b=40;
	int add() {
		int c=a=b;
		System.out.println("the sum is "+c);
		return c;
	}
	
	
}

public class NoInOutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1 m=new method1();
		int res=m.add();
		System.out.println(res);
		

	}

}
