class Test1
{
  public static void main(String args[])
  {
    int []x=new int [] {10,20,30};
    int sum=0;
    for(int i=0;i< x.length;i++)
    {
      sum=x[i]+sum;
      }
      System.out.println(sum);
      System.out.println((float)sum/3);
   }
}
      