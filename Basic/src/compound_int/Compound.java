package compound_int;

import java.util.Scanner;

public class Compound {
	
	public static double compInt(double principal,double rate,double years) 
	{
		double inter=principal*(Math.pow((1+rate/100),years));
		return inter;
		
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principal amount, Rate of Int "
				+ "and time(in years)");
	
		double ci=compInt(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		//System.out.println(Math.pow(10, 2));
		
		System.out.println(String.format("%.2f", ci));
	}
}
