package com.nav.multiThread;

public class ThreadUsingThreadClass extends Thread{ //1. Extends Thread class

	@Override //Override run method 
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("new thread created "+ i);			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadUsingThreadClass bs=new ThreadUsingThreadClass();
//		bs.run();
//		bs.start();
		bs.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main thread "+ i);			
		}
		
	}

}
