class Class_And_Object
{
	public static void main(String[] args);
	private int length,breadth,height;
	public void setDimension(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	public void showDimension()
	{
		System.out.println("L="+length);
		System.out.println("B="+breadth);
		System.out.println("H="+height);
	}
	
}

class Example
{
	public static void main()
	{
		Class_And_Object box= new Class_And_Object();
		box.setDimension(100,200,300);
		box.showDimension();
		//box= new Class_And_Object() will create new object and previous values will becomae garbage
	}
}