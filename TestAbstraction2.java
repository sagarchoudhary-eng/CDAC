abstract class Bike{
	Bike(){System.out.println("Bike is created") ;}
	abstract void run() ;
	void gear(){System.out.println("Gear changed");}
}

class honda extends Bike{
	void run(){System.out.println("running safely");}
}

class TestAbstraction2{
	public static void main(String[] args){
		Bike b =new honda();
		b.run() ;
		b.gear() ;
	}
}