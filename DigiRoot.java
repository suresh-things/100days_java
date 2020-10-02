package First;
import java.util.*;
public class DigiRoot {
	static int digiroot(int n)
    {
        int sum=0;
        while(n>0||sum>9)
        {
            if(n==0)
            {
                n=sum;
                sum=0;
            }
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 System.out.println(digiroot(n));

	}

}
