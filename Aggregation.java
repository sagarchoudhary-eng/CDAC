class Address{
	String city ;
	String state ;

	Address(String city , String state)
	{
		this.city = city ;
		this.state = state ;
	}
}

public class Aggregation{
	int id ;
	String name ;
	Address add ;

	Aggregation(int id ,String name,Address add){
		this.id = id ;
		this.name = name ;
		this.add = add ;
	}
	void display(){
		System.out.println(id+" "+name);
		System.out.println(add.city+" "+add.state);
	}
	public static void main(String[] args){
		Address add1 = new Address("bpl","mp") ;
		Address add2 = new Address("c" , "up") ;

		Aggregation e1 = new Aggregation(10,"sam",add1) ;
		Aggregation e2 = new Aggregation(20,"wam",add2);
		e1.display() ;
		e2.display() ;
	}


}