package LogicalArray;

public class LongestSubArray {
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		int k=9;
		int a=0;
		for(int i=0;i<arr.length;i++)
		{	
			int sum=arr[i];
			int c=1;
			for(int j=i+1;j<arr.length;j++) {
				
				sum=sum+arr[j];
				c++;
				if(sum==k)
				{
					if(a<c)
					{
						a=c;
					}	
				}	
			}
		}
		if(a!=0 ) {
		System.out.println("count:"+a);
			return;
		}
		else
		{
			for(int i=0;i<arr.length;i++)
			{
				if(k==arr[i])
				{
					a=1;
				}
			}
		}
		System.out.println("count:"+a);	
	}

}
