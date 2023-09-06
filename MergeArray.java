package LogicalArray;

import java.util.Scanner;

public class MergeArray {
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
		
		int[] arr3=new int[size1+size2];
		int k=0;
		for(int i=0;i<arr1.length;i++)
		{
			arr3[k]=arr1[i];
			k++;
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			arr3[k]=arr2[i];
			k++;
		}
		
		for(int ele:arr3)
		{
			System.out.print(ele+" ");
		}
		

	}

}
