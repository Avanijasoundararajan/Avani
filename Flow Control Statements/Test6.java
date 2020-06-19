class Test6
{
  public static void main(String[] args) {
		int n1 = Integer.parseInt(args[1]);
		String s = args[0];
		if((s.equals("Female")) && (n1 >= 1 && n1 <= 58))
                    System.out.println("8.2%");
		else if((s.equals("Female")) && (n1 >= 59 && n1 <= 100))
                     System.out.println("9.2%");
		else if((s.equals("Male")) && (n1 >= 1 && n1 <= 58)) 
                      System.out.println("8.4%");
		else{
			if((s.equals("Male")) && (n1 >= 1 && n1 <= 58))  
                            System.out.println("10.5%"); 
		}
     }
}
   