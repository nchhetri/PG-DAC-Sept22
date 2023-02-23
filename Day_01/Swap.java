class Swap
{
	public void swap(int a, int b)
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a: "+a+ " and  b: "+ b);
	}
	public static void main(String[] args)
	{
		Swap s = new Swap();
		s.swap(10, 20);
	}
}