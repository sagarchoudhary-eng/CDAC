class ArrayClon{
	static int[] getArr(){
		return new int[]{3,4,6,7} ;	
	}
	public static void main(String[] args){
		int []arr = getArr() ;
		for(int var : arr){
			System.out.println(var) ;
		}
		int ar[] = new int[4] ;
		System.arraycopy(arr , 0 , ar , 0 ,4);
		for(int i=0 ; i< ar.length ; i++){
			System.out.print(ar[i]) ;
		}
		int a[] = arr.clone() ;
		for(int r : arr){
			System.out.println(r) ;
		}
	}
	
}