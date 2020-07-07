class Animal{
	void eat(){System.out.println("animal eats") ;}
}

class Dog extends Animal{
	void eat(){System.out.println("dog eats") ;}
}

class BabyDog extends Dog{
	void eat(){System.out.println("babydog eats");}
}

class Polymorphism{
	public static void main(String[] args){
		Animal a1,a2,a3 ;
		a1 = new Dog() ;
		a2 = new BabyDog() ;
		a3 = new Animal() ;
		
		a1.eat() ;
		a2.eat() ;
		a3.eat() ;
	}
}