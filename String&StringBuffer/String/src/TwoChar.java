import java.util.Scanner;

public class TwoChar {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2="";
		int len=str1.length();
		for(int i=0;i<len;i++)
		{
			str2=str2+str1.substring(0,2);
		}
		System.out.println(str2);
	}

}
