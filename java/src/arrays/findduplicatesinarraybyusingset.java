package arrays;

import java.util.HashSet;
import java.util.Set;

public class findduplicatesinarraybyusingset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,56,7,89,7,4,2,3,3};
		Set<Integer> s=new HashSet();
		
		for(int no:a)
		{
			if(s.add(no)==false)
			{
				System.out.println(no);
			}
		}
		
		
	}

}
