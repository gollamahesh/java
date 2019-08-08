package arrays;

import java.util.HashSet;

public class findfirstduplicateinarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,34,5,31,12,2,1};
		int temp=-1;
		HashSet<Integer> hs=new HashSet<>();
		for(int i=a.length-1;i>=0;i--)
		{
			if(hs.contains(a[i]))
			{
				temp=i;
			}
			else
			{
				hs.add(a[i]);
			}
			
		}
		if(temp!=-1)
		{
			System.out.println(a[temp]);
		}
	}

}
