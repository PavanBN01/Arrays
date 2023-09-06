package LogicalArray;

public class ReveseArray1 {
	public static void main(String[] args) {
		int[] arr1={3,7,2,6,5,4,1};
		int[] arr2=new int[arr1.length];
		
		int j=0;
		for(int i=arr1.length-1;i>=0;i--)
		{
			
			arr2[j]=arr1[i];
			j++;
		}
		
		for(int ele:arr2)
		{
			System.out.print(ele+", ");
		}
		
	}

}
