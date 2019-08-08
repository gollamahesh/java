package sorting;

public class practice {

	int array[];
	int temparray[];
	int length;
	public static void main(String args[])
	{
		int a[]= {2,1,4,2,1,4,5,6,77,88,55,44,33};
		practice p=new practice();
		p.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public void sort(int inputarray[])
	{
	this.array=inputarray;
	this.length=inputarray.length;
	this.temparray=new int[length];
	divide(0,length-1);
	}
	
	public void divide(int lowerindex,int higherindex)
	{
		if(lowerindex<higherindex)
		{
			int middleindex=(lowerindex+higherindex)/2;
			
			//divide left side part
			divide(lowerindex,middleindex);
			//divide right side part
			divide(middleindex+1, higherindex);
			mergesort( lowerindex, higherindex, middleindex);
			
		}
		
	}
	
	public void mergesort(int lowerindex,int higherindex,int middleindex)
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
				k++;	
			}
			else
			{
				array[k]=temparray[j];
				j++;
				k++;
			}
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
	
	
	
}
