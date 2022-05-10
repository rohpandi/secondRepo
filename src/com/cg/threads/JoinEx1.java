package com.cg.threads;

public class JoinEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread Started");
		JoinTask task = new JoinTask();
		Thread t1 = new Thread(task);
		t1.start();
		System.out.println("***I Am Waiting***");
		//t1.join();
		t1.join(7000);
		System.out.println("Main Thread Ends");

	}

}
