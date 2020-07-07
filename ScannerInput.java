import java.util.Scanner ;
class ScannerInput{
	public static void main(String[] args){
	System.out.println("enter no of inputs you want to enter") ;
	Scanner sc = new Scanner(System.in) ;
	int a = sc.nextInt() ;
	int [] arr = new int [a] ;
	for(int i=0 ; i < a ;i++){
		  arr[i] = sc.nextInt() ;
	}
	for(int i : arr){
		System.out.println(i) ;
	}
}
}