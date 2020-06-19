class Test14
{
  public static void main(String[] args) {
		int len = args[0].length();
		int sum = 0,n = 0;
		for(int i = 0; i < len; i++){
			n = Integer.parseInt(String.valueOf(args[0].charAt(i)));
			sum = sum + n;
		}
		System.out.println(sum);
	}
}