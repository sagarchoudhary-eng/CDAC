public class MultipleCatchBlock{
/*In this example, try block contains two exceptions. 
But at a time only one exception occurs and its corresponding catch block is invoked.*/
	public static void main(String[] args){
		try{
			int a[]=new int[5];    
                	a[5]=30/0;    
                	System.out.println(a[10]);  
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Rest of code");
	}
}