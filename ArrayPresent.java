package LogicalArray;

import java.util.Scanner;

public class ArrayPresent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st array Size");
		int size1=sc.nextInt();
		int[] arr1=new int[size1];
		System.out.println("Enter Elements for 1st array");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter 2st array Size");
		int size2=sc.nextInt();
		int[] arr2=new int[size2];
		System.out.println("Enter Elements for 2st array");
		for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		if(arr1.length<arr2.length)
		{
			
			int c=0;
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr2.length;j++)
				{
					if(arr1[i]==arr2[j])
					{
						c++;
					}
				}
			}
		
			
			if(arr1.length==c)
			{
				System.out.println("A is subset of B");
			}
			else
			{
				System.out.println("A is not subset of B");
			}
			
			
		}
		
		else {
			int c=0;
			for (int i=0;i<arr2.length;i++)
			{
				for(int j=0;j<arr1.length;j++)
				{
					if(arr2[i]==arr1[j])
					{
						c++;
					}
				}
			}
			if(arr2.length==c)
			{
				System.out.println("B is subset of A");
			}
			else
			{
				System.out.println("B is not subset of A");
			}
			
		}
		
		
		
	}
	
	

}
