class Test4
  {
    public static void main(String args[])
     {
        int x[] = new int {65, 120, 98, 75, 115};
        String str =null;
        for(int i: x)
          {
            str = Character.toString((char)i);
            System.out.println(str);
            }
    }
}