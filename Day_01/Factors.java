class Factors
{
	public static void Factor(int num)
	{
		System.out.println("Factors of "+num+" are:  ");
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.print(i+"  ");
			}
		}
	}
	public static void main(String[] args)
	{
		Factors.Factor(20);
	}
}