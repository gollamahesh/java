package practice;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check:  ");
		int no=s.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
