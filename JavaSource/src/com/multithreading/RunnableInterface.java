package com.multithreading;

public class RunnableInterface implements Runnable{

	@Override
	public void run() {
		System.out.println("My thread is working....");
		
	}
	
	public static void main(String[] args) {
		RunnableInterface ri = new RunnableInterface();
		
		Thread thread = new Thread(ri);
		
		thread.start();
	}

}
