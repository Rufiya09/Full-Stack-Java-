package com.odigos.threads;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("odigos");
		System.out.println(Thread.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		MyThread obj = new MyThread();
		Thread thread = new Thread(obj);//new state 
		thread.start();
		
		System.out.println(Thread.currentThread());
		Thread.currentThread().setPriority(8);
		Thread.currentThread().setName("kakinada");
		System.out.println(Thread.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
