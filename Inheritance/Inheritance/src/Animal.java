class Animal{
	Animal(){
		System.out.println("Animal class constructor");
	}
	void eat(){
		System.out.println("Animal class eat() method");
	}
	void sleep(){
		System.out.println("Animal class sleep() method");
	}
}
class Bird extends Animal{
	Bird(){
		super();
		System.out.println("Bird class constructor");
	}
	void eat(){
		System.out.println("Bird class eat() method");
	}
	void sleep(){
		System.out.println("Bird class sleep() method");
	}
	void fly(){
		System.out.println("Bird class fly() method");
	}
}
