package arrays;

public class maxandminvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {93,2,4,5,6,7,8};
		
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
				
			}
		}
		System.out.println("max   "+max);
		System.out.println("min  "+min);
	}

}
