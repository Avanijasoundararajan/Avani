import java.util.*;
public class FormatString {
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			String formated = String.format("%08d",Integer.parseInt(Integer.toBinaryString(input)));
			System.out.println(formated);
		}
	}



