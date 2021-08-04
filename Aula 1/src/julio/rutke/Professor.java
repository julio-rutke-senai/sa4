package julio.rutke;

public class Professor extends Pessoa {
	
	private String lattes;

	public String getLattes() {
		return lattes;
	}

	public void setLattes(String lattes) {
		this.lattes = lattes;
	}
	

	@Override
	public void registrarPresenca() {
		System.out.println(super.getNome()+" Confirmou Aula");
		
	}
	
	@Override
	public String toString() {
		return "Profesor "+getNome();
	}

}
