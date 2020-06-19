class Test7
{
  public static void main(String args[])
  {
   char a=args[0].charAt(0);
   int d=(int)a;
  if(a>='A' && a<='Z')
  {
   char b=(char)(d+32);
   System.out.println(a+"->"+b);
   }
   else
   {
    char c=(char)(d-32);
    System.out.println(a+"->"+c);
    }
   }
}