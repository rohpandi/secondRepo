package com.cg.threads;

public class MultiplethreadsArrayIterationEx {

	public static void main(String[] args) {
	int arr[] = {4,54,87,5,4,8,7,9,9,7,56,6,8,78,2,9,4,8,7,99,5,89,
			44,66,33,54,78,17};
	Task2 task2 = new Task2();
	Thread t1=new Thread (task2);
	
	Thread t2=new Thread (task2);
	t1.setName("Thread A");
	t2.setName("Thread B");
	t1.start();
	t2.start();
	task2.setArr(arr);
	

	}

}
