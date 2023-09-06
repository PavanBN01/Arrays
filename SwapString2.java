package LogicalArray;

public class SwapString2 {
	public static void main(String[] args) {
		
		String s1="hello";
		String s2="world";
		
		s2=s2+'	'+s1;
		String[] arr=s2.split("	");
		
		s1=arr[0];
		s2=arr[1];
		
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
		
	}
}
