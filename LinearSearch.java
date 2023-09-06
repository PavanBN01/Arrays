package LogicalArray;

import java.util.Scanner;

public class LinearSearch {
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
		
		System.out.println("Elements are");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter Searching element");
		int ele=sc.nextInt();
		int flag=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==ele)
			{
				System.out.println("Element is found");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Elements is not found");
		}
		
	}

}
