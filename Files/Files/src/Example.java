

	import java.io.*;
	import java.util.Scanner;

	public class Example{
	    public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        String file = sc.nextLine();
	        String ch1 = sc.next();
	        String ch2;
	        int count = 0;
	        if(ch1.charAt(0)>='a'&&ch1.charAt(0)<='z'){
	            ch2 = ch1.toUpperCase();
	        }
	        else{
	            ch2 = ch1.toLowerCase();
	        }
	        try{
	            FileInputStream fin=new FileInputStream(file);
	            BufferedInputStream bin=new BufferedInputStream(fin);
	            int i;
	            while((i=bin.read())!=-1){
	                if(ch1.charAt(0)==(char)i||ch2.charAt(0)==(char)i){
	                    count++;
	                }
	            }
	            bin.close();
	            fin.close();
	        }catch(Exception e){System.out.println(e);}
	        System.out.println(count);
	    }
	}


