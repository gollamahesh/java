package arrays;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class removeduplicatesfromsortedarrayusinghashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,4,3,2,1,7,8,9};
		
		Set<Integer> s=new HashSet();
		
		for(int no:a)
		{
			if(s.add(no))
			{
			System.out.println(no);	
			}
		}
		
	}

}
