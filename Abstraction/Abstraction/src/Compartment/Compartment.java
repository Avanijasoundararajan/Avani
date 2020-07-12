package Compartment;
public abstract class Compartment {
	public abstract String notice();
}
class FirstClass extends Compartment{
	@Override
	public String notice(){
		return "This compartment is FirstClass";
	}
}
class Laddies extends Compartment{
	@Override
	public String notice(){
		return "This compartment is Laddies";
	}
}
class General extends Compartment{
	@Override
	public String notice(){
		return "This compartment is General";
	}
}
class Luggage extends Compartment{
	@Override
	public String notice(){
		return "This compartment is Luggage";
	}
}