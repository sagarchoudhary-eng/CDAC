class ThreadEx1 implements Runnable{
	public void run(){
		System.out.println("thread is running");
	}
	public static void main(String[] args){
		ThreadEx1 obj = new ThreadEx1();
		Thread t1 = new Thread(obj);
		t1.start() ; 
	}
}