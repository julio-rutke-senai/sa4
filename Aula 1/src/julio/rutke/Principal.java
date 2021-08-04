package julio.rutke;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Professor professor = new Professor();
		professor.setNome("Julio Cezar");
		professor.setCpf("000000000000");
		professor.setEmail("julio.rutke@edu.sc.senai.br");
		professor.setEndereco("Rua das Couves, 5000");
		professor.setLattes("http://lattes.cnpq.com");
		professor.setTelefone("47 88888888");
		
		EstudanteTecnico estudante = new EstudanteTecnico();
		estudante.setNome("Joaão da Silva");
		estudante.setCpf("11122233345");
		estudante.setEmail("joao@estudante.senai.br");
		estudante.setMatricula("00987");
		
		professor.registrarPresenca();
		
		estudante.registrarPresenca();
		
		Turma turma = new Turma();
		turma.setNome("Técnico EAD");
		
		List<Professor> professores = new ArrayList<Professor>();
		professores.add(professor);
		turma.setProfessores(professores);
		
		List<Estudante> estudantes = new ArrayList<Estudante>();
		estudantes.add(estudante);
		turma.setEstudantes(estudantes);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(estudante);
		pessoas.add(professor);	
		
		System.out.println(professor);

	}

}
