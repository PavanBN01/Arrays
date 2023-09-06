package LogicalArray;

import java.util.Scanner;

public class BubbleSorting {
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
			int flag=0;
			for(int j=0;j<size-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
				
			}
			if(flag==0)
			{
				break;
			}
		}
		
		for(int ele:arr)
		{
			System.out.println(ele);
		}
		
		
	}

}
