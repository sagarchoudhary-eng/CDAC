class Exception1{
	public static void main(String[] args){
		try
		{
			int data = 50/0;

			/*if we write reamining code in try block and if exception 
			occurs then rest of code will not execute then keep remaining out of try block*/
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of code");
	}
}