package LogicalArray;

import java.util.Arrays;

public class Rotate {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int n=1;
		
		while(n!=0)
		{
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>=0;i--)
			{	
				if(i!=0)
				{
					arr[i]=arr[i-1];
				}
				else
				{
					arr[i]=temp;
				}	
			}
			
			n--;
		}   
		System.out.println(Arrays.toString(arr));
	}

}
