class SwapNoThird
{
	public void swap(int a, int b)
	{
		a += b ;
		b = a-b;
		a -= b;
		System.out.println("a: "+a+" and "+"b: "+b);
	}

	public static void swap1(int a, int b)
	{
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a: "+a+" and "+"b: "+b);
	}
	public static void main(String [] args)
	{
		SwapNoThird s = new SwapNoThird();
		s.swap(10,23);
		
		SwapNoThird.swap1(13,27);
	}
}