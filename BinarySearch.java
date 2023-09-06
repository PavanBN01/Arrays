package LogicalArray;

public class BinarySearch {
	
	
	public static void binarySearch(int[] arr,int ele)
	{
		int l=0,r=arr.length-1;
		int mid=0;
		int flag=0;
		while(l<=r)
		{
			mid=(l+r)/2;
			if(ele==arr[mid])
			{
				System.out.println("Element is found");
				flag=1;
				break;
			}
			else if(ele>arr[mid])
			{

				l=mid+1;
			}
			
			else if(ele<arr[mid])
			{
				
				r=mid-1;
			}
		}
		if(flag==0)
		{
			System.out.println("Element is not found");
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr={12,25,36,48,89,99,106};
		int ele=46;
		binarySearch(arr, ele);
	}

}
