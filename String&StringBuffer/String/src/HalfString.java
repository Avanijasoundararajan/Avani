import java.util.Scanner;

public class HalfString {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String str1=sc.next();
		int len=str1.length();
		if(len% 2==0)
		{
		 	System.out.println(str1.substring(0,len/2));
		}
		else{
			System.out.println("Null");
		}
	}

}
