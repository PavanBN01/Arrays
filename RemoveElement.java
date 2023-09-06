package LogicalArray;

import java.util.Scanner;

public class RemoveElement {
	
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
		
	
		System.out.println("Enter Position");
		int posi=sc.nextInt();
		int temp=arr[posi-1];
		for(int i=posi-1;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		 
		 for(int i=0;i<size-1;i++)
		 {
			 
			 System.out.println(arr[i]);
		 }
		 
		 System.out.println("The deleted element is"+temp);
		 
	}

}
