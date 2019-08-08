package arrays;

import java.util.ArrayList;

public class numberofoddandevennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				al1.add(a[i]);
			}
			else
			{
				al2.add(a[i]);
			}
		}
		
		int total=0,total2=0;
		int length=0,length2=0;
		
		for(int no:al1)
		{
			total=total+no;
			length=al1.size();
			System.out.println(no);
		}
		System.out.println("total number even numbers are   "+total);
		System.out.println("Length of the even numbers is   "+length);
		
		for(int num:al2)
		{
			total2=total2+num;
			length2=al2.size();
			System.out.println(num);
		}
		System.out.println("total number of odd numbers are   "+total2);
		System.out.println("Length of odd numbers is   "+length2);
		
	}

}
