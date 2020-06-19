class Test7
{
 public static void main(String args[])
 {
  int x[]= new int [] {12,34,12,45,67,89};
   for (int i = 0; i < x.length; i++)
        {
            System.out.print(x[i]+" ");
        }		
    }
    
    public static int array_sort(int[] x) {
         int index = 1;
        for (int i = 1; i < x.length; i++) {
            if (x[i] != x[index-1])
                x[index++] = x[i];
        }
	  return index;
    }
}