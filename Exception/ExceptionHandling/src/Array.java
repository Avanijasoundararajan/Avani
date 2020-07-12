
import java.util.*;
public class Array {
	public static void main(String[] args)throws NumberFormatException{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		try{
			
			for(int i = 0; i < size; i++)
				arr[i] = Integer.parseInt(sc.next());
			
			int index = sc.nextInt();
			System.out.println(arr[index]);
			//System.out.println("The array element successfully accessed");
		}
		catch(NumberFormatException e){
			throw new NumberFormatException();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
}