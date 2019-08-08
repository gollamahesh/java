package practice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number to check: ");
		
		int no=s.nextInt();
		int temp=no;
		int rev=0;
		while(temp!=0)
		{
			rev=rev*10+temp%10;
			System.out.println(rev);
			temp=temp/10;
		}
		if(rev==no)
		{
			System.out.println("palindrome number");
		}else
		{
			System.out.println("not a palindrome");
		}
		
	}

}
