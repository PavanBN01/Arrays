package LogicalArray;

import java.util.Scanner;

public class UniqueNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		
		boolean a=true;
		while(n!=0)
		{
			int rem=n%10;
			n=n/10;
			int temp=n;
			while(temp!=0)
			{
				int rem1=temp%10;
				if(rem==rem1)
				{
					a=false;
					break;
				}
				temp=temp/10;
			}
			
		}
		if(a==true)
		{
			System.out.println("Unique");
		}
		else
		{
			System.out.println("Not Unique");
		}
	}

}
