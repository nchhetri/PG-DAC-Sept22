class Pallindrome
{
	public static boolean checkPall(int num)
	{
		String str = ""+num;
		for(int i=0,j=str.length()-1; i<=j; i++,j--)
		{
			if(str.charAt(i)!= str.charAt(j))
				return false;	
		}		
		return true;
	}
	public static void main(String [] args)
	{
		boolean ans = Pallindrome.checkPall(11223);
		
		if(ans)
			System.out.println("It is a pallindrome");
		else
			System.out.println("Not Pallindrome");
	}
}