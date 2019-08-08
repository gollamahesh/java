package programs;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter number of values to show fibonacci series:  ");
		int n=s.nextInt();
		int a=0; int b=1;
		for(int i=0;i<n;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		
	}

}
