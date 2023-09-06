package LogicalArray;

import java.util.Scanner;

public class Divisible5OrNot {
	
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
		
		System.out.println("Elements Divisible by 5");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%5==0)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
