class Test12
{
  public static void main(String args[])
  {
    int n=Integer.parseInt(args[0]);
    int a=1;
    for(int i=2;i<=n;i++)
     {
        if(n % i ==0)
        {
            a++;
	   }
      }
     if(a==2)
       System.out.println(args[0]+" is a prime number");
     else 
        System.out.println(args[0]+" is not prime number");
   }
}
     