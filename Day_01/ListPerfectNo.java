class ListPerfectNo
{
	public static void isPerfectNumber(int num)
	{
		for(int i=2;i<=num; i++)
		{
			int res=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
					res += j;
			}
			if(res==i)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args)
	{
		ListPerfectNo.isPerfectNumber(1000);
		
	}
}
