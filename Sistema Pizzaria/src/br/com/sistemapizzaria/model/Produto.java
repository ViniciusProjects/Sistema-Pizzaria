package br.com.sistemapizzaria.model;

public class Produto {
	public String nome;
	public String ingredientes;
	public double valor;
	
	public Produto() {
		
	}
	@Override
	public String toString() {
		return this.nome;
	}

}
