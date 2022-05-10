package com.cg.threads;

public class JoinTask implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Child Work Completed");
	}

}
