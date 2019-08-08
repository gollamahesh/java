package programs;

public class magicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int no=46;
		int sum,rem;
		
		while(no>9)
		{
			sum=0;
			while(no!=0)
			{
				rem=no%10;
				System.out.println(rem);
				sum=sum+rem;	
				System.out.println(sum);
				no=no/10;
				System.out.println(no);
				
			}
			no=sum;
		}
		if(no==1)
		{
			System.out.println("Magic Happened");
		}

		
	}

}
