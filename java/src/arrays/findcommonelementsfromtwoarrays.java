package arrays;

import java.util.HashSet;
import java.util.Set;

public class findcommonelementsfromtwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,5,43,2,1};
		int b[]= {1,2,3,4,5,6,7,5,4,3,2,1};
		
		Set<Integer> s1=new HashSet<>();
		Set<Integer> s2=new HashSet<>();
		
		for(int no:a)
		{
			s1.add(no);
		}
		for(int no2:b)
		{
			s2.add(no2);
		}
		for(int no2:s2)
		{
			if(s1.add(no2)==false)
			{
				System.out.println(no2);
			}
		}
		
	}

}
