

public class Employee extends Person {
	double annual_salary;
	int year_of_employee_started;
	String national_insurance_number;
	Employee(double a,int y,String n){
		super(n);
		this.annual_salary = a;
		this.year_of_employee_started = y;
		this.national_insurance_number = n;
	}
	public void setsalary(double a){
		this.annual_salary = a;
	}
	public void setyear(int y){
		this.year_of_employee_started = y;
	}
	public void setinsurance(String n){
		this.national_insurance_number = n;
	}
	public double getsalary(double a){
		return annual_salary;
	}
	public int getyear(int y){
		return year_of_employee_started;
	}
	public String getinsurance(String n){
		return national_insurance_number;
	}
}
