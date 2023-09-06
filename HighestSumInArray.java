package LogicalArray;

public class HighestSumInArray {
	public static void main(String[] args) {
		int[] arr= {7,2,5,9,3,9};
		int sum=0;
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]>sum)
				{
					sum=arr[i]+arr[j];
				}
			}
		}
		
		System.out.println(sum);
	}

}
