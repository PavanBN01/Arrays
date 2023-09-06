package LogicalArray;

public class ReverseNumberInElement {
	public static void main(String[] args) {
		int[] arr= {45,96,78,25,64,52};
		
		for(int i=0;i<arr.length;i++)
		{
			int n=arr[i];
			int rev=0;
			while(n!=0)
			{
				int rem=n%10;
				rev=rev*10+rem;
				n=n/10;	
			}
			arr[i]=rev;
		}
		
		
		for(int ele:arr)
		{
			System.out.print(ele+" ");
		}
	}

}
