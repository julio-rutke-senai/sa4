package julio.rutke;

import java.util.Date;

public class Estudante extends Pessoa {
	
	private String matricula;
	private Date nascimento;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	@Override
	public void registrarPresenca() {
		System.out.println(super.getNome()+ " Respondeu a Chamada");
		
	}
	

}
