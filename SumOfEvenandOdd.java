package LogicalArray;

import java.util.Scanner;

public class SumOfEvenandOdd {
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
		
		int sum1=0,sum2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum1=sum1+arr[i];
			}
			else
			{
				sum2=sum2+arr[i];
			}
		}
		
		System.out.println(sum1);//56,24
		System.out.println(sum2);//35,40
	}

}
