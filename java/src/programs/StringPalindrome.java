package programs;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="mam";
		int length=s.length();
		String temp="";
		for(int i=length-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);
		}
		System.out.println(temp);
		if(s.equals(temp))
		{
			System.out.println("String palindrome");
		}else
		{
			System.out.println("Not a String palindrome");
		}
	

	}

}
