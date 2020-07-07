class ThreadEx extends Thread{
	public void run(){
		System.out.println("thread is running");
	}
	public static void main(String[] args){
		ThreadEx obj = new ThreadEx();
		obj.start();
	}
}