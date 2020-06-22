import java.util.Scanner;

public class FirstSecondString {
      public static void main(String args[])
      {
  
    	  Scanner sc=new Scanner(System.in);
      	  String a=sc.next();
    	  String b=sc.next();
    	  int len1=a.length();
    	  int len2=b.length();
    	  int looplen;
    	  String str="";
    	  if(len1>len2 )
    	  {
    		  looplen=len1;
    	  }
    	  else
    	  {
    		  looplen=len2;
    	  }
    	  for(int i=0;i<looplen;i++)
    	  {   
    		  if(i<len1)
    		    str=str+a.charAt(i);
    		  if(i<len2)
    		    str = str + b.charAt(i);
    	  }
    	  System.out.println(str);
    	 
    	  }
      }

