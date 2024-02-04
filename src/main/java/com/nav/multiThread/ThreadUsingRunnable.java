package com.nav.multiThread;

public class ThreadUsingRunnable implements Runnable{
	
	@Override
	public void run() {
		Thread.currentThread().setName("navin");
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());			
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadUsingRunnable tr=new ThreadUsingRunnable();
		Thread th=new Thread(tr);
		th.start();
		for(int i=0;i<=10;i++) {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());			
		}
		
	}
}
