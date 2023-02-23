class DigitSum
{
	public static void sum(int num)
	{
		int res = 0;
		while(num !=0)
		{
			res += num%10;
			num /= 10;
		}
		System.out.println("Res: "+res);
	}
	public static void main(String[] args)
	{
		DigitSum.sum(233);
	}
}