package LogicalArray;

import java.util.Scanner;

public class SumOfOddIndxEle {
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
		
		int sum=0,c=0;
		for(int i=0;i<size;i++)
		{
			if(i%2!=0)
			{
				sum=sum+arr[i];
				c++;
			}
		}
		System.out.println("Sum of Odd Index Element is: "+sum/c);
		
	}
}
