class Test9
{
  static void withoutTen(int[] a,int len){
		for(int i = 0; i < len; i++){
			System.out.print(a[i] + " ");
		}
	}
	public static void main(String[] args) {
		int len = args.length;
		int[] a = new int[len];
		int i = 0;
		for(String b : args){
			a[i] = Integer.parseInt(b);
			if(a[i] == 10) 
				a[i] =0;
			i++;
		}
		for(i = 0; i < len -1; i++){
			for(int j = 0 ; j < len- i - 1; j++){
				if(a[j] < a[j + 1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		withoutTen(arr,len);
	}
}