package fibonacci;

public class Fibonacci {
	
	public static void fibo(int n)
	{
		int a=0;
		int b=1;
		int c;
		System.out.print("0 1 ");
		for (int i=2;i<n;i++)
		{
			c=a+b;
			
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		

		fibo(6);
	}

}
