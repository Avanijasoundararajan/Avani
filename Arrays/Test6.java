class Test6
{
  public static void main(String args[])
  {
    int x[]=new int []{ 3,5,7,2,8};
    int count=5,temp;
    for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (x[i] > x[j]) 
                {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++) 
        {
            System.out.print(x[i] + ", ");
        }
        System.out.print(x[count - 1]);
    }
}