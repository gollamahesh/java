package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,4,44,55,43,56};
		
		for(int i=0;i<a.length;i++)
		{int temp;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println(a[1]);
		
	}

}
