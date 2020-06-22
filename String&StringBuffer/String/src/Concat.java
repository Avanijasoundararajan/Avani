import java.util.Scanner;

public class Concat {
	public static void main(String args[])
	{
		String str="";
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		str=str.toLowerCase();
		String arr[]=str.split(",",2);
		
		char str1=arr[0].charAt(arr[0].length()-1);
		char str2=arr[1].charAt(0);
		
		if(str1==(str2))
		{
			
		    arr[1] = arr[1].substring(1,arr[1].length());
		}
		else
		{
			arr[1]=" "+arr[1];
		}
		System.out.println(arr[0]+arr[1]);
		
		
		
		//System.out.println(str.toLowerCase());
	}

}
