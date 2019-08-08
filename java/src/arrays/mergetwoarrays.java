package arrays;

public class mergetwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		
		int  lengthA=a.length;
		int lengthB=b.length;
		int lengthC=lengthA+lengthB;
		int c[]=new int[lengthC];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
	}

}
