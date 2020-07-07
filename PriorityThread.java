/*Each thread have a priority. Priorities are represented by a number between 1 and 10. In most cases, 
thread schedular schedules the threads according to their priority (known as preemptive scheduling). 
But it is not guaranteed because it depends on JVM specification that which scheduling it chooses.

3 constants defined in Thread class:
public static int MIN_PRIORITY
public static int NORM_PRIORITY
public static int MAX_PRIORITY
Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.
*/

class PriorityThread extends Thread{
	public void run(){
		System.out.println("running thread name is:"+Thread.currentThread().getName());
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args){
		PriorityThread obj1 = new PriorityThread();
		obj1.setPriority(Thread.MIN_PRIORITY);
		PriorityThread obj = new PriorityThread();
		obj.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		obj.start();
	}
}