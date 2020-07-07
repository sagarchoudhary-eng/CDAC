/*The join() method waits for a thread to die. 
In other words, it causes the currently running threads to
 stop executing until the thread it joins with completes its task.

Syntax:
public void join()throws InterruptedException
public void join(long milliseconds)throws InterruptedException
Example of join() method
n the above example,when t1 is completes its task for
 1500 miliseconds(3 times) then t2 and t3 starts executing.
*/
class TestJoinMethod extends Thread{
	public void run(){
		for(int i=1; i<4 ;i++){
			try{
			Thread.sleep(1500);
			}catch(Exception e){System.out.println(e);}
		
			System.out.println(i);
		}
}
	public static void main(String[] args){
		TestJoinMethod t1 = new TestJoinMethod();
		TestJoinMethod t2 = new TestJoinMethod();
		TestJoinMethod t3 = new TestJoinMethod();
		t1.start();
		try{
			t1.join();
		}catch(Exception e){System.out.println(e);}
		t2.start();
		t3.start();
	}
}

