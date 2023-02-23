class Factorial
{
	public static int fact(int num)
	{
		int res = 1;
		if(num>0)
		{
			for(int i= num; i>0; i--)
			{
				res *= i;
			}
		}
		return res;
	}
	
	
	// Recursion
	public static int fact1(int num)
	{
		if(num==0)
			return 1;
		
		return num * fact1(num-1);
	}
	
	public static void main(String[] args)
	{
		int result = Factorial.fact(5);
		System.out.println("Result: "+result);
		
		int result1 = Factorial.fact1(7);
		System.out.println("Recursion Result: "+result1);
	}
}