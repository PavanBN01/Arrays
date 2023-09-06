package LogicalArray;

public class SecongSmallestElement {
public static void main(String[] args) {
		
		int[] arr= {41,40,36,38,36};
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		
		System.out.println(min);
		
		int min2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min2>arr[i]&&arr[i]!=min)
			{
				min2=arr[i];
			}
		}
		System.out.println(min2);
	}
}
