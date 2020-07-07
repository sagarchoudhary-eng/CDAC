class SynchronizationEx{
	 synchronized void printtable(int n){
		for(int i=1 ;i<5;i++){
			System.out.println(n*i);
		try{
			Thread.sleep(400);
		}catch(Exception e){System.out.println(e);}
		}
	}

}

class Mythread extends Thread{
	SynchronizationEx t ;
	Mythread(SynchronizationEx t){
		this.t = t ;
	}
	public void run(){
		t.printtable(5);
	}
}

class Mythread1 extends Thread{
	SynchronizationEx t;
	Mythread1(SynchronizationEx t){
		this.t = t;
	}
	public void run(){
		t.printtable(70);
	}
}

class TestSynchronizationEx{
	public static void main(String[] args){
		SynchronizationEx obj = new SynchronizationEx();
		Mythread t1 = new Mythread(obj) ;
		Mythread1 t2 = new Mythread1(obj);
		t1.start();
		t2.start();
	}

}