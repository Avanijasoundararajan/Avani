class Employee implements Cloneable{
	String name;
	int empid;
	@Override
	public String toString(){
		return "Name of an employee "+name+"\n"+"Employee Id "+ empid;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}