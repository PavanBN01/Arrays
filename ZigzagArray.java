package LogicalArray;

import java.util.Arrays;

public class ZigzagArray {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,45,63,25};
		int[] arr2= {100,200,300,400,600,700,800};
		int[] arr3=new int[arr1.length+arr2.length];
		int x=0,y=0;
		for(int i=0;i<arr3.length;)
		{
			
			if(x<arr1.length)
			{
				arr3[i++]=arr1[x++];
			}
			if(y<arr2.length)
			{
				arr3[i++]=arr2[y++];
			}
				
		}
		System.out.println(Arrays.toString(arr3));
	}

}
