import java.util.*;
public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		int n=26;
		int flag=1;
		if(str.length()<n)
		{
			System.out.println("Not Pangram");
			flag=0;
		}
		else
			for(char c='A';c<='Z';c++)
			{
				if((str.indexOf(c)<0) && (str.indexOf((char)(c+32))<0))
				{
					System.out.println("This is not a Pangram");
					flag=0;
					break;
				}
			}
		if(flag==1)
		{
			System.out.println("PAngram");
		}
		
	}

}
