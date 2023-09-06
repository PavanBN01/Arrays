package LogicalArray;

import java.util.Arrays;

public class QuickSorting {
	
	public static int position(int[] arr,int li,int hi)
	{
		int start=li;
		int end=hi;
		int pivote=arr[li];
		while(start<end) {
			
			while(arr[start]<=pivote && start<arr.length-1)
			{
				start++;

			}
			while(arr[end]>pivote  && end>0)
			{
				end--;
			}
			if(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		int temp=arr[li];
		arr[li]=arr[end];
		arr[end]=temp;

		return end;
	}

public static void quickSorting(int[]arr,int li,int hi)
{
	if(li<hi)
	{
		int l=position(arr, li, hi);
		quickSorting(arr, li, l-1);
		quickSorting(arr, l+1, arr.length-1);
	}
}

public static void main(String[] args) {
	int[] arr= {0,3,6,35,-2 ,2,3};
	quickSorting(arr, 0, arr.length-1);

	System.out.println(Arrays.toString(arr));
	
	

}

}
