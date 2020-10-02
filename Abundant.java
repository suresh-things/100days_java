package First;
import java.util.*;

public class Abundant {
	static int sumFac(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				
			}
			
		}
		return sum;
	}

	static boolean isAbundant(int n)
	{
		if(sumFac(n)>n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isAbundant(n))
		{
			System.out.println("Abundant number");
		}
		else
		{
			System.out.println("Not Abundant Number");
		}

	}

}
