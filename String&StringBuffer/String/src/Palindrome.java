import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	   {
		   String instr;
		   Scanner sc =new Scanner(System.in);
		   instr=sc.next();
		   String revstr="";
		   int len=instr.length();
		  
		   for(int i=len-1;i>=0;i--)
		   {
			   //System.out.println(i);
			   revstr=revstr+instr.substring(i,i+1);
		   }
		   System.out.println(revstr);
		   if(revstr.equals(instr))
		   {
			   System.out.println("It is Palindrome");
		   }
		   else
			   System.out.println("It is not Palindrome");
		   
	   }
	}


