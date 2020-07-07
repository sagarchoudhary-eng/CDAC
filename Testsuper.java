class Person{
	int id ;
	String name ;
	Person(int id , String name){
		this.id = id ;
		this.name = name ;
	}
	void msg(){ System.out.println("super method called");}
}

class Emp extends Person{
	float salary ;
	Emp(int id , String name ,float salary){
		super(id , name) ;
		this.salary = salary ;
	}
	void display() {   
		System.out.println(id+" "+name+" "+salary); 
		super.msg() ;}
}
class Testsuper{
	public static void main(String[] args){
		Emp e1 = new Emp(10,"Sagar",100000f);
		e1.display() ;
	}
	
}