package br.edu.ucsal.restalunos.viewer.model;

import java.util.ArrayList;
import java.util.List;

public class TurmaRepository {
	
	List<Turma> turmas = new ArrayList<>();
	
	public TurmaRepository() {
		Turma turma = new Turma("AQS01", "B415");
		
		turma.adicionarAluno(new Aluno("Renan de Paula", 1));
		turma.adicionarAluno(new Aluno("Pedro Almeida", 2));
		turma.adicionarAluno(new Aluno("Thiago Barbosa", 3));
		turma.adicionarAluno(new Aluno("Amanda dos Santos", 4));
		turma.adicionarAluno(new Aluno("Jorge Luiz", 5));
		
		Turma turma2 = new Turma("AQS02", "B410");
		
		
		turma2.adicionarAluno(new Aluno("Aluno Teste 06", 6));
		turma2.adicionarAluno(new Aluno("Aluno Teste 07", 7));
		turma2.adicionarAluno(new Aluno("Aluno Teste 08", 8));
		turma2.adicionarAluno(new Aluno("Aluno Teste 09", 9));
		turma2.adicionarAluno(new Aluno("Aluno Teste 10", 10));
		
		turmas.add(turma);
		turmas.add(turma2);
		
	}
	
	public Turma pesquisarTurma(String nome) {
		for (Turma turma : turmas) {
			if(turma.getNome().equals(nome)) {
				return turma;
			}
		}
		return null;
	}
	
	public Aluno pesquisarAluno(int matricula) {
		for (Turma turma : turmas) {
			for (Aluno aluno : turma.getAlunos()) {
				if(aluno.getMatricula() == matricula) {
					return aluno;
				}
			}
		}
		return null;
	}
	
	public List<Turma> getTurmas(){
		return turmas;
	}


}
