class ExcepThrow{
	static void validate(int n){
		if(n < 18){
			throw new ArithmeticException("not valid");
		}
		else
			System.out.println("welcome to vote");
	}
	public static void main(String[] args){
		try{
		validate(13) ;
		}catch(ArithmeticException m)
		{
			System.out.println(m) ;
		}
		System.out.println("rest of code..") ;
	}


}