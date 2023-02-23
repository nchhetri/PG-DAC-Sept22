class RevNum
{
	public static int revVar(int a)
	{
		String str = ""+a;
		int unit = 1;
		int res = 0;
		
		for(int i=1; i<str.length(); i++)
		{
			unit *= 10;
		}
		for(int i=0; i<str.length(); i++)
		{
			res += ((a%10)*unit);
			a /= 10;
			unit /=10;
		}
		
		return res;
	}
	public static void main(String[] args)
	{
		System.out.println(RevNum.revVar(123));
	}
}