package exceptionhandling;
import java.util.*;
public class Exception1 {
	public static void main(String[] args)throws NumberFormatException{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> students_name = new ArrayList<String>();
		ArrayList<Integer> marks = new ArrayList<Integer>();
		ArrayList<Integer> average = new ArrayList<Integer>();
		System.out.println("Enter the students name");
		students_name.add(sc.next());
		students_name.add(sc.next());
		System.out.println("Enter the students marks");
		for(int i = 0 ; i < 6; i++){
			int value = sc.nextInt();
			try{
				if(value >= 0 && value <= 100){
					marks.add(Integer.parseInt(String.valueOf(value)));
				}
				else{
					throw new NumberFormatException();
				}
			}
			catch(NumberFormatException e){
				System.err.print(e);
			}	
		}
		for(int i = 0 ; i < 2; i++){
			average.add(marks.get(0)+marks.get(1)+marks.get(2));
			average.add(marks.get(3)+marks.get(4)+marks.get(5));
		}
		System.out.println("Average of a student1 "+average.get(0)+","+"Average of a student2 "+average.get(1));
	}
}