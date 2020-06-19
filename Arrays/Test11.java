class Test11
{
 static boolean only14(int[] arr1){
		boolean ans = false;
		for(int a : arr1){
			if((a == 1) || (a== 4)) ans = true;
			else{
				 ans = false;
				 break;	
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr1 = new int[args.length];
		int i = 0;
		for(String str : args){
			arr1[i] = Integer.parseInt(str);
			i++;
		}
		boolean b = only14(arr1);
		System.out.println(b);
		//else System.out.println("false");
	}
}