class SynchronizationEx1{
	synchronized public void table(int n){
		for(int i=1;i<5;i++){
			System.out.println(n*i);
		}
		try{
		Thread.sleep(500);
		}catch(Exception e){System.out.println(e);}
	}

}

public class SyncByAnonymousClass
{
	public static void main(String[] args)
		{
		SynchronizationEx1 obj = new SynchronizationEx1();
		Thread t1 = new Thread()
		{
			public void run()
			{
				obj.table(5);
			}
		};
		Thread t2 = new Thread()
			{
			public void run()
				{
				obj.table(3);
				}
			};
			
	
		t1.start();
		t2.start();
	}

}