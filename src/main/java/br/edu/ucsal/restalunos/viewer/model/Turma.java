package br.edu.ucsal.restalunos.viewer.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private String nome;
	private String sala;
	private List<Aluno> alunos = new ArrayList<>();
	
	public Turma() {
		
	}
	
	public Turma(String nome, String sala) {
		this.nome = nome;
		this.sala = sala;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public String getSala() {
		return sala;
	}
	
	public void setSala(String sala) {
		this.sala = sala;
	}
	
	public void adicionarAluno(Aluno aluno) {
		aluno.setTurma(this);
		aluno.setNomeTurma(this.nome);
		this.alunos.add(aluno);
	}
	
}
