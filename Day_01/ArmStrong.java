class ArmStrong
{
	public static void checkArmstrong(int num)
	{
		String str = ""+num;
		int temp=0;
		int num1 = num;
		for(int i=0; i<str.length(); i++)
		{
			int a = num1%10;
			temp += (a*a*a);
			num1 /= 10;
		}
		
		if(temp == num)
			System.out.println("Is an ArmStrong number");
		else
			System.out.println("Is not an ArmStrong number");
	}
	public static void main(String[] args)
	{
		ArmStrong.checkArmstrong(11);
	}
}