import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Strings");
		String First_String=sc.next();
		String Second_String=sc.next();
		String str1=First_String.replaceAll("\\s","");
		String str2=Second_String.replaceAll("\\s","");
		boolean status=true;
		if(str1.length()!=str2.length())
		{
			status=false;
		}
		else
		{
			char[] Array_str1=str1.toLowerCase().toCharArray();
			char[] Array_str2=str2.toLowerCase().toCharArray();
			Arrays.sort(Array_str1);
			Arrays.sort(Array_str2);
			status=Arrays.equals(Array_str1, Array_str2);
		}
		if(status)
		{
			System.out.println(First_String+" "+"and"+" "+Second_String+" are anograms");
			
		}
		else
		{
			System.out.println("The given Strings are not anograms");
		}
		

	}

}
