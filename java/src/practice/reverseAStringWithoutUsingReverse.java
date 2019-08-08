package practice;

public class reverseAStringWithoutUsingReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="mahesh";
		int length=a.length();
		String reverse="";
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
		}
		System.out.println(reverse);
		
	}

}
