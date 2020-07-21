/*Create an employee class with properties of your choice.
Create an object of this class and also create a clone of the same. 
After making the clone, change the properties of the original employee object 
and print the properties of both the original and clone object and note down your observation.*/



public class Cloning {
	public static void main(String[] args) throws CloneNotSupportedException{
		Employee obj1 = new Employee();
		obj1.empid = 306;
		obj1.name = "Deepika";
		Employee obj2 = (Employee)obj1.clone();
		obj2.empid = 104;
		obj2.name = "Deepi";
		System.out.println(obj1);
		System.out.println(obj2);
	}
}