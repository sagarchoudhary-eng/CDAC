public class DaemonThread extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
		/*checking for daemon thread*/
			System.out.println("daemon thread work");
		}
		else {
			System.out.println("user thread work");
		}
	}
	public static void main(String[] args){
		DaemonThread obj = new DaemonThread();
		DaemonThread obj1 = new DaemonThread();
		DaemonThread obj2 = new DaemonThread();
		obj.setDaemon(true); /*t1 thread is daemon thread*/
		obj.start();
		obj1.start();
		obj2.start();
	}
}