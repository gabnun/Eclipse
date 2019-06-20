package com.cursos.java.basico.thread;

public class MinhaThread extends Thread {

	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo) {
		this.setNome(nome);
		this.tempo = tempo;
		start();

	}

	public void run() {

		try {for (int i = 0; i <6; i++) {
			System.out.println(nome + " Executando a thread: " + i);
			Thread.sleep(tempo);
		}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
