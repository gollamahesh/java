package practice;

public class swappingWithoutUsingThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11; int b=21;
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		//a=a+b;
		//b=a-b;
		//a=a-b;
		System.out.println("After swapping the numbers  :" +a+"  "+b );
		
		
	}

}
