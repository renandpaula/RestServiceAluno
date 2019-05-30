package br.edu.ucsal.restalunos.viewer.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ucsal.restalunos.viewer.model.Aluno;
import br.edu.ucsal.restalunos.viewer.model.Turma;
import br.edu.ucsal.restalunos.viewer.model.TurmaRepository;

@RestController
@RequestMapping("/api/")
public class MateriaController {


	@GetMapping(path="/turma", produces="application/json")
	public ResponseEntity<?> index() {
		
		TurmaRepository repository = new TurmaRepository();
		
		List<Turma> turmas = repository.getTurmas();
		
		return new ResponseEntity<List<Turma>>(turmas, HttpStatus.OK);
	}
	
	@GetMapping(path = "/turma/{nome}", produces="application/json")
	public ResponseEntity<?> getTurma(@PathVariable String nome) {

		TurmaRepository repository = new TurmaRepository();
		
		 Turma turma = repository.pesquisarTurma(nome);
		
		return new ResponseEntity<Turma>(turma, HttpStatus.OK);
	}
	
	@GetMapping(path = "/aluno/{matricula}", produces="application/json")
	public ResponseEntity<?> getAluno(@PathVariable int matricula) {

		TurmaRepository repository = new TurmaRepository();
		
		 Aluno aluno = repository.pesquisarAluno(matricula);
		
		return new ResponseEntity<Aluno>(aluno, HttpStatus.OK);
	}

}
