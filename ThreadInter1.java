package com.odigos.threads;

class Number {
	public int n;// 1,2
	boolean value = false;//true

	synchronized void even(int n)// 2 
	{
		if (!value)// false
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.n = n;
		System.out.println(n);// 2
		value = false;
		notify();
	}

	synchronized void odd(int n)// 1,3
	{
		if (value)// false
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println(n);// 1,2,3
		value = true;
		notify();
	}
}

class Odd implements Runnable {
	Number num;

	Odd(Number num) {
		this.num = num;
		new Thread(this, "odd").start();
	}

	public void run() {
		for (int i = 1; i <= 100; i = i + 2) {
			num.odd(i);// 1,3
		}
	}
}

class Even implements Runnable {
	Number num;

	Even(Number num) {
		this.num = num;
		Thread t = new Thread(this, "even");
		t.start();
	}

	public void run() {
		for (int i = 2; i <= 100; i = i + 2) {
			num.even(i);// 2
		}
	}
}

public class ThreadInter1 {
	public static void main(String[] args) {
		Number number = new Number();
		Even e = new Even(number);
		Odd d = new Odd(number);
	}
}