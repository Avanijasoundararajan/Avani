class Test16
{
 public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int len = args[0].length();
		while(len > 0) {
			System.out.print(args[0].charAt(len-1));
			len--;
		}
	}
}