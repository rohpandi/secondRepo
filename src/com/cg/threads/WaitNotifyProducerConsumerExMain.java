package com.cg.threads;

public class WaitNotifyProducerConsumerExMain {
public static void main(String[] args) {
	Video v=new Video();
	Audio a=new Audio();
	v.setAudio(a);
	a.setVideo(v);
	Thread t1=new Thread(v);
	Thread t2=new Thread(a);
	t1.start(); t2.start(); //runnable mode
}
static class Video implements Runnable{
	private Audio audio;
	
	public void setAudio(Audio audio) {
		this.audio = audio;
	}
	public void run() {
		playVideo();
	}
	synchronized void playVideo(){
		for (int i = 1; i <= 10; i++) {
			System.out.println("********** playing Video ****** " +i);
				synchronized (audio) { //ACQUIRE THE LOCK  of audio object & unblock
					audio.notify(); //signal to waiting thread
				}
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
static class Audio implements Runnable{
	Video video;

	public void setVideo(Video v) {
		this.video = v;
	}
	public void run() {
		playAudio();
	}
	synchronized void playAudio(){
		for (int i = 1; i <= 10; i++) {
			try {
				wait();//release the lock & block state
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("------ playing Audio -------"+i);
			synchronized (video) { //acquire the lock of video object
				video.notify(); // notify the thread
			}
		}
	}
	
}
}