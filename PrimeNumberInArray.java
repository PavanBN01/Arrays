package LogicalArray;

public class PrimeNumberInArray {

	public static boolean isPrime(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) 
			{
				c++;
			}
		}
		
		if(c==2)
		{
			return true;
		}
		return false;
	}

	
	public static void main(String[] args) {
		int[] arr = {59,6,71,11,96,111};
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i])) {
				System.out.print(arr[i]+", ");
			}
		}
		
		
	}

}
