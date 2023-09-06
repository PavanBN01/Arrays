package LogicalArray;

public class MissingElement {
	public static void main(String[] args) {
		int[] arr= {2,-1,3,4,1};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
// one way	
//		for(int i=arr.length-1;i>0;i--)
//			{
//				if(!(arr[i]-arr[i-1]==1))
//				{
//					int n=arr[i]-1;
//					System.out.println("Missing element: "+n);
//				}
//				
//			}
		
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
		}
		int sum2=0;
		for(int i=arr[0];i<=arr[arr.length-1];i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2-sum1);
	}
	

}
