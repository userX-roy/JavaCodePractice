package com.multithreading;

public class TestThread implements Runnable{

	@Override
	public void run() {
		
		int threadPriority = Thread.currentThread().getPriority();
		
		/*
		 * getPriority() method will return an integer of which is priority of currently running thread
		 */
		
		String name=Thread.currentThread().getName();
		/*
		 * currentThread() method will return running thread instance ;; getName will returning
		 *  a string which is the name of the Thread (i.e., either set by user with setName() method 
		 *  or the default name given by compiler)
		 */
		
		for (int i = 0; i < 6; i++) {
			System.out.println(name +"("+threadPriority+")"+" is executing : "+i);
		}
		
	}
	
	public static void main(String[] args) {
		TestThread testThread = new TestThread();
		
		Thread thread = new Thread(testThread);
		thread.setName("Saikat-Threadd");
		
		Thread thread2 = new Thread(testThread);
		thread2.setName("Samar-Threadd");
		
		thread.setPriority(1);
		thread2.setPriority((int)8.);
		
		thread.start();
		thread2.start();
	}

}

/*
 * Thread Schedular : It will decide which thread will start first.
 * It decide based on 2 things : [Thread Priorites + Underlying OS]
 * 
 * 
 * 
 * Thread Priorities : 1 - 10
 * 
 * 1==> Minimum Priority
 * 5==> Normal or Default priority
 * 10==>Maximum Priority.
 */




