class Test3
{
  public static void main(String args[])
  {
		int[] a1 = {1,4,34,56,7};
		int k = 90; //int k = 56;
		int count = 0,i = 0;
		for(i = 0; i < 5; i++){
			if(a1[i] == k) 
                           break;
			else 
			   count++;
		}
		if(count == 5) 
		   System.out.println("-1");
		else 
		   System.out.println(i);
	}
}