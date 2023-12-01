package add_numbers_binary_char;

import java.util.Scanner;



public class Add {
	
	 public static String
	    addCharToStringUsingSubString(String str, char c,
	                                  int pos)
	    {
	        return str.substring(0, pos) + c
	            + str.substring(pos);
	    }
	
	public static void main(String[] args) {
		String n1,n2,sum;
		int a1,a2;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 2 binary numbers");
		n1=sc.next();
		n2=sc.next();
		a1=Integer.parseInt(n1,2);// converts string n1 to int and 2 
		                          //means convert to decimal
		a2=Integer.parseInt(n2,2);
		
		sum = Integer.toBinaryString(a1+a2);
		System.out.println("Sum is = "+sum);
		
		
		
		String str="abcdefghi";
		
//		System.out.println(str.substring(3));
//		System.out.println(str);
//		System.out.println(str.substring(0,3));
		System.out.println(addCharToStringUsingSubString(str, 'z',3));
		
	}
}
