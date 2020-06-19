class Test17
{
 public static void main(String[] args) {
		int len = args[0].length();
		int i = 0,c = 0;
		while(i < len){
			if((args[0].charAt(i)) == (args[0].charAt(len-i-1))) 
                        {
                        c++;
			i++;
                       }
		}
		if(c == len) 
                  System.out.println(args[0]+"is a palindrome");
		else 
                   System.out.println(args[0]+" is not a palindrome");
	}
}