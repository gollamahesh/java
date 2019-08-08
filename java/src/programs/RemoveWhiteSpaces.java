package programs;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string is immutable object, that means we cannot change the value 
		//of string once declared
		
		String s="mahesh babu golla";
		String ss=s.replace(" ", "");
		
		System.out.println(ss);

	}

}
