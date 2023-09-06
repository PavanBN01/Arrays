package LogicalArray;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size-1;i++)
		{
			int min=i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			
			if(min!=i)
			{
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
		
//		for(int ele:arr)
//		{
//			System.out.println(ele);
//		}
		
		
		System.out.println(Arrays.toString(arr));
	}

}
