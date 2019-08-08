package arrays;

public class findduplicatesinarraybybruteforcemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,56,7,89,7,4,2,3};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j]) && (i!=j))
				{
					System.out.println(a[j]);
				}
				
				
			}
			
		}
		
		
	}

}
