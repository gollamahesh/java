package sorting;

public class mergesort {
	int []array;
	int []temparray;
	int length;
	
	public void sort(int inputarray[])
	{
		this.array=inputarray;
		this.length=inputarray.length;
		this.temparray=new int[length];
		divide(0,length-1);
	}
	
	public void divide(int lowerindex, int higherindex)
	{
		if(lowerindex<higherindex)
		{
			int middleindex=(lowerindex+higherindex)/2;
			//it will divide the leftside
			divide(lowerindex,middleindex);
			//it will divide the right hand side
			divide(middleindex+1,higherindex);
			mergesort(lowerindex,middleindex,higherindex);
		}
	}

	public void mergesort(int lowerindex,int middleindex,int higherindex)
	{
		for(int i=lowerindex;i<=higherindex;i++)
		{
			temparray[i]=array[i];
		}
		int i=lowerindex;
		int j=middleindex+1;
		int k=lowerindex;
		
		while(i<=middleindex && j<=higherindex)
		{
			if(temparray[i]<=temparray[j])
			{
				array[k]=temparray[i];
				i++;
			}else
			{
				array[k]=temparray[j];
				j++;
			}
			k++; 
		}
		while(i<=middleindex)
		{
			array[k]=temparray[i];
			i++;
			k++;
		}
		while(j<=higherindex)
		{
			array[k]=temparray[j];
			j++;
			k++;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int input[]= {2,1,1,3,4,33,22,11,66,55,34};
		mergesort m=new mergesort();
		m.sort(input);
		for(int i:input)
		{
			System.out.println(i);
		}
		
	}
	
	

}
