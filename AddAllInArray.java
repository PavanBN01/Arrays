package LogicalArray;

import java.util.Arrays;
import java.util.Scanner;

public class AddAllInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st array Size");
		int size1=sc.nextInt();
		int[] arr1=new int[size1];
		System.out.println("Enter Elements");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd array size");
		int size2=sc.nextInt();
		int[] arr2=new int[size2];
		System.out.println("Enter Elements");
		for(int i=0;i<size2;i++)
		{        
			arr2[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int[] arr3=new int[size1+size2];
		System.out.println("Enter Position");
		int posi=sc.nextInt();
		int a=posi-1;
		int n1=0;
		int n2=0;
		for(int i=0;i<arr3.length;i++)
		{
			if(i>=a && i<size2+a)
			{
				arr3[i]=arr2[n1++];
				
			}
			else
			{
				arr3[i]=arr1[n2++];
				
			
				
			}
			
		}
		System.out.println(Arrays.toString(arr3));
	}

}
