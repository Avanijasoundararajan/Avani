package exceptionhandling;

class InvalidInputException extends Throwable{
	InvalidInputException(){
		System.out.println("Input must be within 18-60 range");
	}
}
public class Exception2{
	public static void main(String[] args) throws InvalidInputException{	
		try{
			String name = args[0];
			if(Integer.parseInt(args[1])>= 18 && Integer.parseInt(args[1]) <= 60){
				int age = Integer.parseInt(args[1]);
				System.out.println(name);
				System.out.println(age);
			}
			else{
				throw new InvalidInputException();
			}
		}
		catch(InvalidInputException e){
			System.err.println(e);
		}
	}
}


