class ThreadSleepMethod extends Thread{
	public void run(){
		for(int i=1 ;i<5;i++){
			try{
				Thread.sleep(200,10);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		ThreadSleepMethod obj = new ThreadSleepMethod();
		obj.start();
		ThreadSleepMethod obj1= new ThreadSleepMethod();
		obj1.start();
	}
}
/* we cannot start a thread twice,If you does so,
 an IllegalThreadStateException is thrown. 
In such case, thread will run once but for second time, it will throw exception.*/