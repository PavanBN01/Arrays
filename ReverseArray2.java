package LogicalArray;

public class ReverseArray2 {
	public static void main(String[] args) {
		int[] arr= {5,4,2,3,9,7};
		int s=0;
		int e=arr.length-1;
		
		while(s<e)
		{
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
		
		for(int ele:arr)
		{
			System.out.print(ele+", ");
		}
	}

}
   


