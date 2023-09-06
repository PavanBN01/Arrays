package LogicalArray;

public class FrequencyOfElements {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,30,30,10};
		int[] arr=new int[arr1.length];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr1[i];
		}
		
		System.err.println("Number\tCount");
		for(int i=0;i<arr.length;i++)
		{
			
			int c=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] )
				{
					c++;
					arr[j]=-1;
				}
			}
			
			if(arr[i]!=-1)
			System.out.println(arr[i]+"\t"+c);
			
		}
		
		
	}

}
