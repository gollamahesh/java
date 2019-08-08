package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findelementapperonce {

	public static void main(String[] args) {
		
	int a[]= {1,2,3,4,5,6,5,4,2,1};

	HashMap<Integer, Integer> hm=new HashMap<>();
	for(int no:a)
	{
		Integer count=hm.get(no);
		if(count==null)
		{
			hm.put(no, 1);
		}else
		{
			count=count+1;
			hm.put(no, count);
		}
	}
	Set<Map.Entry<Integer,Integer>> se=hm.entrySet();
	
	for(Map.Entry<Integer, Integer> es:se)
	{
	if(es.getValue()==1)	
	{
		System.out.println(es.getKey());
	}
		
	}
	
	}

}
