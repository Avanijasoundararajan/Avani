import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ShortLong {
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		//StringBuffer str=new StringBuffer();
		BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
		String a=buf.readLine();
		String b=sc.next();
		
			System.out.println(a+b+a);
		
}
}