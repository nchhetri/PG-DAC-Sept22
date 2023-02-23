class AddWOArith
{
	public static void add(int num1, int num2)
	{
		for(int i=1; i<=num2 ; i++)
		{
			num1++;
		}
		
		System.out.println(num1);
	}
	public static void main(String[] args)
	{
		AddWOArith.add(12,33);
	}
}