package LogicalArray;

public class MatrixMul {
	public static void main(String[] args) {
		int[][] arr1= {{3,2,3},{1,4,5},{2,1,6}};
		int[][] arr2= {{4,3,1},{9,6,5},{3,2,1}};
		int[][] arr3=new int[arr1.length][arr2.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				for(int k=0;k<arr3.length;k++)
				{
					arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
				}
			}
		}
		
		
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3.length;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
