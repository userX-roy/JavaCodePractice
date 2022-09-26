//Date : 12.09.2022

package com.multithreading;

public class ThreadClass extends Thread{

	@Override
	public void run() {
		System.out.println("Child class run method");
		//super.run();
	}
	
	public static void main(String[] args) {
		ThreadClass aobj = new ThreadClass();
		Thread thread = new Thread(aobj);
		thread.start();
	}
}
