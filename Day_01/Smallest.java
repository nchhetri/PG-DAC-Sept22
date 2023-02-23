class Smallest
{
	public static int smallestNum(int a, int b, int c)
	{
		int res=0;
		
		while(a !=0 && b!=0 && c !=0)
		{
			a--;
			b--;
			c--;
			res++;
		}
		
		return res;
	}
	public static void main(String[] args)
	{
		System.out.println(Smallest.smallestNum(10, 12, 7));
	}
}