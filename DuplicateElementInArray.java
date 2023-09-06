package LogicalArray;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		int[] arr= {5,2,6,3,8,8,99,22,99,22,36};
		
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
			if(c>1 &&arr[i]!=-1)
			System.out.println(arr[i]);
		}
		
		
	}

}
