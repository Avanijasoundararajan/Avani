import java.util.Scanner;

public class LeftRight {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  String a=sc.next();
	  int position=a.indexOf("*");
	  System.out.println(a.substring(0,position-1)+a.substring(position+2));
	  
	  
  }
}
