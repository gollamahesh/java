package programs;


public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=54748;
		int t1=no;
		int length=0;
		while(t1!=0)
		{
			t1=t1/10;
			length=length+1;
		}
		
		int t2=no;
		int arm=0;
		while(t2!=0)
		{
			int rem=t2%10;
			int mul=1;
			
			for(int i=1;i<=length;i++)
			{
				mul=rem*mul;
			}
			arm=arm+mul;
			t2=t2/10;
System.out.println(mul);
		}
		if(arm==no)
		{
			System.out.println("true");
		}
		
	}

}
