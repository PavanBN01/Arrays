package LogicalArray;

import java.util.Scanner;

public class RemoveDuplicateElement {
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
		
		
		for(int i=0;i<arr.length;i++)
		{
			int c=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
					c++;
				}
			}
			if(c>0 &&arr[i]!=-1)
			System.out.println(arr[i]);
		}
		
		
	}


}
