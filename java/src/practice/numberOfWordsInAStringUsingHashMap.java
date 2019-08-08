package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class numberOfWordsInAStringUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "mahesh babu babu babu mahesh golla king king king of kings";
		
		String split[]=str.split(" ");
		
		HashMap<String, Integer> hm=new HashMap<>();
		
		for(String s:split)
		{
			Integer count=hm.get(s);
			if(count==null)
			{
				hm.put(s, 1);
			}else
			{
				count=count+1;
				hm.put(s, count);
			}
		}	
		Set<Map.Entry<String, Integer>> es=hm.entrySet();
		for(Map.Entry<String, Integer> em:es)
			{
				
				if(em.getValue()>1)
				{
					System.out.println(em.getKey()+"   "+em.getValue());
				}
	}
	}
	


}
