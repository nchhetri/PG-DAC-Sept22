class ListArmStrong
{
	public static void listArmstrongNumbers(int range)
	{
		for(int i=1; i<=range; i++)
		{
			int res = 0;
			int temp= 0;
			int num = i;
			String str=""+i;
			for(int j=0; j<str.length();j++)
			{	
				temp = num%10;
				num /= 10;
				res += (temp*temp*temp);
			}
			if(res==i)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args)
	{
		ListArmStrong.listArmstrongNumbers(1000);
	}
}