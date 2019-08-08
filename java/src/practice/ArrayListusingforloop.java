package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListusingforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		for(int a:al)
		{
			System.out.println(a);
		}
		
	
	}

}
