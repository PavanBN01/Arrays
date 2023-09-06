package LogicalArray;

import java.util.Arrays;
import java.util.Scanner;

public class InsertEleInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		int[] arr=new int[size+1];
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
	
		System.out.println("Enter Position");
		int posi=sc.nextInt();
		if(posi>0||posi<=size)
		{
			System.out.println("Enter Element");
			int ele=sc.nextInt();
			
			for(int i=size-1;i>=posi-1;i--)
			{
				arr[i+1]=arr[i];
			}
			arr[posi-1]=ele;
			size++;
			
			for(int i=0;i<size;i++)
			{
				System.out.println(arr[i]);
			}
		}
		else
		{
			System.out.println("Invalid Position");
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
