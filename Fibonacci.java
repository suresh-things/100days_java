package First;
import java.util.*;

import java.util.Scanner;

public class Fibonacci {
	static boolean isFibonacci(int n)
	{
		int num1=0,num2=1;
		int num3=0;
		while(num3<n)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}
		if(num3==n)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isFibonacci(n))
		{
					System.out.println("fibonacci");
		}
		else
		{
			System.out.println("not fibonacci");
		}


	}

}
