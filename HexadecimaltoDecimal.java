package LogicalArray;

import java.util.Scanner;

public class HexadecimaltoDecimal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter headecimal value");
		String s2=s.next();
		
		String s1="0123456789ABCDEF";
		int value=0;
		s2=s2.toUpperCase();
		
		for(int i=0;i<s2.length();i++)
		{
			char c=s2.charAt(i);
			int d=s1.indexOf(c);
			value=16*value+d;
		}
		System.out.println(value);
	}

}
