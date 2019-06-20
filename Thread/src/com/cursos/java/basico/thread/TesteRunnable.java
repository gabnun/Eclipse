package com.cursos.java.basico.thread;

public class TesteRunnable {

	public static void main(String[] args) {
	
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 300);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 900);
		

	}
}
