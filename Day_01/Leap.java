class Leap
{
	public static void checkLeapYear(int year)
	{
		if((year%4==0) && ((year%400 == 0) || (year%100 !=0)))
		{
			System.out.println("Is a Leap year!!!");
		}
		else
		{
			System.out.println("Is not a Leap year!!!");
		}
	}
	public static void main(String[] args)
	{
		Leap.checkLeapYear(2004);
		Leap.checkLeapYear(2100);
	}
}