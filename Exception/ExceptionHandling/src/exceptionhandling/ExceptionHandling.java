package exceptionhandling;
public class ExceptionHandling{
	public static void main(String[] args)throws Exception{
		int[] arr = new int[5];
		int i = 0;
		for(String s : args){
			arr[i++] = Integer.parseInt(s);
		}
		try{
			int sum = 0,average = 0;
			for(i = 0; i < 5; i++){
				sum = sum + arr[i];
			}
			average = sum/5;
			System.out.println(sum);
			System.out.println(average);
		}
		catch(Exception e){
			System.err.println(e);
		}
	}
}