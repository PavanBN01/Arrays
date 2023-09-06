package LogicalArray;

public class MultiMissingElement {
	public static void main(String[] args) {

		int[] arr= {1,2,7,8};

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
		
		int start=arr[0];
		int end=arr[arr.length-1];
		
		for(int i=start;i<=end;i++)
		{
			boolean flag=false;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
					flag=true;
					break;
				}
				
			}
			if(flag==false)
			{
				System.out.println(i);
			}	
		}
	}

}
