package LogicalArray;

public class Palindrome {
	public static void main(String[] args) {
		int[] arr= {70,78,69,79,69,78,70};
		
		int i=0,j=arr.length-1;
		int c=0;
		int n=(arr.length/2);
		
		while(n!=0)
		{
			if(arr[i]==arr[j])
			{
				c++;
				i++;
				j--;
			}
			
			n--;
		}
		
		if(c==(arr.length)/2)
		{
			System.out.println("Panlindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
	}

}
