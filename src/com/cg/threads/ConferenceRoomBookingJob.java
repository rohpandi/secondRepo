package com.cg.threads;

public class ConferenceRoomBookingJob implements Runnable {
	private boolean  isAvailable =true;

	@Override
	public void run() {
		book();	
	}
	 synchronized void book() {
		Thread t=Thread.currentThread();
		if(isAvailable ()) {
			System.out.println(t.getName() +" Booking");
			isAvailable = false;
			System.out.println(t.getName()+" Booked");
		}
		else {
			System.out.println(t.getName()+" Not Available");
		}
}
	boolean isAvailable() {
		return isAvailable;
	}

}
