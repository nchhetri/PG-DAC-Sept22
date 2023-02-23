class Digit
{
	public static void printDigit(int num)
	{	
		int temp = num;
		String str = ""+num;
		int len = str.length();
		for(int i=0; i<len; i++)
		{
			System.out.println(temp%10);
			temp /= 10;
		}
	}
	public static void main(String[] args)
	{
		Digit.printDigit(2334212);
	}
}