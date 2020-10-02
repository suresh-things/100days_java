package First;

import java.util.*;
public class Happy{
    static boolean isHappy(int n)
    {
        int sumsq=0;
        
        while(n>0 ||sumsq>9)
        {
        if(n==0)
        {
            n=sumsq;
            sumsq=0;
        }
        sumsq=sumsq+((n%10)*(n%10));
        n=n/10;
        }
        if(sumsq==1 ||sumsq==7)
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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isHappy(n))
        {
            System.out.println("happy");
        }
        else
        {
            System.out.println("not happy");
        }
   }
}