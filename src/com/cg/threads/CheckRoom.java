package com.cg.threads;

public class CheckRoom {

	public static void main(String[] args) throws InterruptedException {
		ConferenceRoomBookingJob room = new ConferenceRoomBookingJob();
		Thread t3= new Thread(room);
		Thread t4= new Thread(room);
		t3.setName("Manager1");
		t4.setName("Manager2");
		
		t3.start();
		t4.start();
		
		t3.join();
		t4.join();
			
	}

	}


