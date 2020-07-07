interface Drawable{
	void draw() ;
}

class Rectangle implements Drawable{
	public void draw(){System.out.println("drawing rectangle");}
}

class Square implements Drawable{
	public void draw(){System.out.println("drawing circle");}
}

class TestAbstraction3{
	public static void main(String[] args){
		Drawable s = new Rectangle() ;
		s.draw() ;
	}
}