package LogicalArray;

public class SumPairs {
	public static void main(String[] args) {
		int[] arr= {8,1,9,2,6,4,2};
		int ele=10;
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==ele)
				{
					System.out.println(arr[i]+" , "+arr[j]);
				}
			}
		}
		
	}

}
