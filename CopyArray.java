package LogicalArray;

import java.util.Scanner;

public class CopyArray {
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
		int[] arr2=new int[arr.length];
		for(int i=0;i<size;i++)
		{
			arr2[i]=arr[i];
		}
		
		for(int ele:arr2)
		{
			System.out.println(ele);
		}
	}

}
