package practice;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s="mahesh babu golla";
	
	char[] a=s.toCharArray();
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;i++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[j]);
				break;
			}
		}
	}

	}

}
