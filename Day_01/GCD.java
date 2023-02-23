class GCD
{
	public static int findGCD(int a, int b)
	{
		int res = 0;
		if(a<=b)
		{
			for(int i=1; i<=a; i++)
			{
				if(a%i==0 && b%i == 0)
					res = i;
			}
		}
		else
		{
			
			for(int i=1; i<=b; i++)
			{
				if(b%i==0 && a%i == 0)
					res = i;
			}
		}
		return res;
	}
	public static void main(String[] args)
	{
		System.out.println(GCD.findGCD(12,144	));
	}
}