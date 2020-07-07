interface A{
	void A();
	void B();
	void C();
	void D();
}

abstract class B implements A{
	public void C(){System.out.println("I am C");}
}

class C extends B{
	public void A(){System.out.println("I am A");}	
	public void B(){System.out.println("I am B");}
	public void D(){System.out.println("I am D");}
}

class AbstractionTest{
	public static void main(String[] args){
		A obj = new C() ;
		obj.A() ;
		obj.B() ;
		obj.C() ;
		obj.D() ;
	}
}