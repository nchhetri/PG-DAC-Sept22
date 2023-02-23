class Even
{	
	void checkEven(int num)
	{
		if(num%2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
	public static void main(String[] args)
	{
		Even ev = new Even();
		ev.checkEven(11);
	}
}