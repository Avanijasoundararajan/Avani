
/*Create a class called Person with a member variable name. Save it in a file called Person.java

Create a class called Employee that will inherit the Person class.The other data members of the Employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java

Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.
*/
import java.util.*;
public class EmployeeTest {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Person name : ");
    String name = scanner.next();
    System.out.println("Enter Employee annual_salary : ");
    double annual_salary = scanner.nextDouble();
    System.out.println("Enter Employee year_of_employee_started : ");
    int year_of_employee_started = scanner.nextInt();
    System.out.println("Enter Employee national_insurance_number  : ");
    String national_insurance_number = scanner.next();
    Employee s = new Employee(annual_salary,year_of_employee_started,national_insurance_number);
	Person s2 = new Person(name);
	s2.setname(name);
	s.setsalary(annual_salary);
	s.setyear(year_of_employee_started);
	s.setinsurance(national_insurance_number);
	System.out.println("Display Person name: "+s2.getname(name));
    System.out.println("Display Employee annual salay: "+s.getsalary(annual_salary));
    System.out.println("Display Employee year the employee started to work: "+s.getyear(year_of_employee_started));
    System.out.println("Display Employee national insurance number: "+s.getinsurance(national_insurance_number));
	}
}
