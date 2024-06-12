package com.odigos.threads;

public class MyThread1 extends Thread {
	@Override
	public void run() {// running
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}// end

	public static void main(String[] args) {
		MyThread1 obj = new MyThread1();// new state
		obj.start();// runnable
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread...");
		}
	}
}
