package arrays;

public class findingmissingnumberinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,3,4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			
			sum=sum+a[i];
			
		}
		//System.out.println(sum);
		int sum2=0;
		for(int j=0;j<=a.length+1;j++)
		{
			sum2=sum2+j;
			
		}
System.out.println(sum2-sum);
	}

}
