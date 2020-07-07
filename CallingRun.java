class CallingRun extends Thread{
	public void run(){
		for(int i=1 ;i<5;i++)
		{
		try
		{
			Thread.sleep(500);
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(i);
}
	}
	public static void main(String[] args){
		CallingRun t1 = new CallingRun();
		t1.run();
		CallingRun t2 = new CallingRun();
		t2.run();	
}

}