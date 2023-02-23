import java.util.*;
class AL
{
	public static void main(String [] args)
	{
		List <Integer> lst = new ArrayList<>();
		lst.add(123);
		lst.add(226);
		
		Integer num1 = 0;
		for(Integer num: lst)
		{
			num1+=num;
		}
		
		System.out.println(num1);
	
		int prim = num1;
		
		System.out.println(prim+69);
	}
}