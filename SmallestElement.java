package LogicalArray;

public class SmallestElement {
	public static void main(String[] args) {
		int[] arr={54,23,47,85,36,66};
		int max2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<max2)
			{
				max2=arr[i];
			}
				
		}
		System.out.println(max2);
	}

}
