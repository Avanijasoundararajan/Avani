import java.util.Scanner;

public class LastString {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int n=sc.nextInt();
		int len=a.length();
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a.substring(n-1));
		}
			
	}

}
