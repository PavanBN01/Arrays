package LogicalArray;

public class SecongHighestElement {
	public static void main(String[] args) {
		
		int[] arr={23,46,32,48,36};
		int max=arr[0];
		int smax=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				smax=max;
				max=arr[i];
			}
			
			else if(arr[i]!=max && arr[i]>smax)
			{
				smax=arr[i];
			}
				
		}
		System.out.println(smax);
	}
}
