import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void prime(int n)
    {
        int arr[] = new int[n+1];
        int k = 0 ; 
        int count=0;
        Outer:for(int i =1; i<=1000;i++)
        {
            count = 0;
      
            int j=1;
            for(; j<=i; j++)
            {
                if((i%j)==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                arr[k] = i;
                k++;
            }
            
            if(k==n+1)
                break Outer;
           
        }
        int arr1[] = new int [3];
			
		for(int i=0;i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
        for(int i=arr.length,l=0;k<=2; l++,i--)
        {
            arr1[l] = arr[i]; 
        }
        
        for(int i=0; i<arr1.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Solution.prime(n);
    }
}