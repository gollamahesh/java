package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class findduplicatesinarraybyusinghashmap {

	public static void main(String[] args) {
		//for getting the values and entering into the hashmap
		int a[]= {1,2,3,4,5,6,5,43,2,1,8,9,76,7,8};
		
		HashMap<Integer, Integer> hm=new HashMap<>();
		
		for(int no:a)
		{
			Integer count=hm.get(no);
			if(count==null)
			{
				hm.put(no,1);
			}else
			{
				count=count+1;
				hm.put(no,count);	
			}
		}
		//for printing the values from hashmap which values greater than 1
		
		Set<Map.Entry<Integer, Integer>> es=hm.entrySet();
		
		for(Map.Entry<Integer,Integer> em:es)
		{
			if(em.getValue()==1)
			{
				System.out.println(em.getKey());
			}
		}
		
	}

}
