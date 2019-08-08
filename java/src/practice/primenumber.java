package practice;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int n=s.nextInt();
		int temp=0;
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;}
			{
				
		}
	}
	if(temp>0)
	{
		System.out.println("not prime");
	}else
	{
		System.out.println(" prime number");
	}
	
	}}


