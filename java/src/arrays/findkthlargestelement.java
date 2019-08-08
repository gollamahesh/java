package arrays;

import java.util.Scanner;

public class findkthlargestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value to find kth largest");
		int k=s.nextInt();
		int a[]= {1,23,45,654,3,46,44,};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			
			}
			//this if condition is for sorting to the kth position only
			//No need to sort other things
			if(i==k-1)
			{
				System.out.println(a[i]);
				break;
			}
		}
		
	}

}
