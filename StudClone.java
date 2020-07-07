class StudClone implements Cloneable{
	int rollno;
	String name ;

	StudClone(int rollno , String name){
		this.rollno = rollno ;
		this.name = name ;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone() ;
	}
	public static void main(String args[]){
		try{
		StudClone  s1 = new StudClone (10 ,"Sagar") ;
		StudClone  s2 = (StudClone )s1.clone() ;
		
		System.out.println(s1.rollno +"  "+ s1.name) ;
		System.out.println(s2.rollno +"  "+ s2.name) ;
		}catch(CloneNotSupportedException c){}
	}
}