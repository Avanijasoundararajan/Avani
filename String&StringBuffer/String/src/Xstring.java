import java.util.Scanner;

public class Xstring {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  String a=sc.next();
	  int len=a.length();
	  
	  System.out.println(a.replaceAll("x",""));
  }
}
