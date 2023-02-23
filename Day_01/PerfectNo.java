class PerfectNo
{
	public static boolean isPerfectNumber(int num)
	{
		int res = 0;
		for(int i=1;i<num; i++)
		{
			if(num%i==0)
				res += i;
		}
		
		if (res==num)
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		boolean b = PerfectNo.isPerfectNumber(23);
		if(b)
			System.out.println("Given Number is a perfect number!!!");
		else
			System.out.println("Given Number is not a perfect number!!!");
	}
}
