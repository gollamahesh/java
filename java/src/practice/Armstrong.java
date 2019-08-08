package practice;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=153;
		
		int t1=no;
		int length=0;
		while(t1!=0)
		{	
			t1=t1/10;
			length=length+1;
		}
	
		int arm=0;
		int t2=no;
		while(t2!=0)
		{
			int mul=1;
		int	rem=t2%10;
		for(int i=0;i<length;i++)
		{
			mul=rem*mul;
		}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==no)
		{
			System.out.println("armstrong number");
		}
	}

}
