class LCM
{
	public static int findLCM(int a, int b)
	{
		if(a>b)
		{
			int temp  = b;
			b = a;
			a = temp;
		}
		int i =a;
		int res=0;
		while((i%a!=0)||(i%b!=0))
		{	
			i+=a;
			res = i;
		}
		
		return res;
	}
	public static void main(String[] args)
	{
		System.out.println(LCM.findLCM(15,7));
	}
}