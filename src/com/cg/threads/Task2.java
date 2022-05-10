package com.cg.threads;

public class Task2 implements Runnable {
private int arr[];

public int[] getArr(){
	return arr;
}

	public void setArr(int[] arr) {
		this.arr=arr;
		
		
	}

	@Override
	public void run() {
		Thread t =Thread.currentThread();
		for(int i=0;i< arr.length;i++)
		{
		System.out.println(arr[i] +" "+ i+" "+t.getName() );
		
	}
//		for(int a:arr) {
//			System.out.println(a +" "+t.getName() );
//		}
		System.out.println("DONE");

}
}
