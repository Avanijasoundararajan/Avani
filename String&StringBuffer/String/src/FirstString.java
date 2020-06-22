import java.util.Scanner;

public class FirstString {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		int len=str1.length();
		System.out.println(str1.substring(1,len-1));
		
	}

}
