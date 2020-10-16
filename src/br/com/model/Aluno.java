package br.com.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aluno {
	
	private int id;
	private String nome;
	private int AnoNascimento;
	
	public Aluno(int id, String nome, int AnoNascimento) {
		this.id = id;
		this.nome = nome;
		this.AnoNascimento = AnoNascimento;

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return AnoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		AnoNascimento = anoNascimento;
	}

	public static void add(Aluno eduarda) {
		// TODO Auto-generated method stub
		
	}

	public static void remove(int id2) {
		// TODO Auto-generated method stub
		
	}

}
