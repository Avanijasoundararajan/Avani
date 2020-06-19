class Test8
{
 public static void main(String[] args) {
        int a[] = new int[args.length];
        int i = 0;
        int index = 0, index1 = 0;
        for(String b  : args){ 
            a[i] = Integer.parseInt(b);
            if(a[i] == 6) index = i;
            if(a[i] == 7) index1 = i;
            i++;
        }
        int sum = 0;
        for(i = 0 ; i < args.length; i++){
            if((i >= index) && (i <= index1)) continue;
            else sum += arr[i];        
        }
        System.out.println(sum);
    }
}