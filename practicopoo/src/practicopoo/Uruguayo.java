package practicopoo;

public class Uruguayo extends Persona{

	private Cedula CI;
	private String Departamento;
	private String Barrio;
	
	public Uruguayo () {
		
	}

	public Cedula getCI() {
		return CI;
	}

	public void setCI(Cedula cI) {
		this.CI = cI;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		this.Departamento = departamento;
	}

	public String getBarrio() {
		return Barrio;
	}

	public void setBarrio(String barrio) {
		this.Barrio = barrio;
	}
	
	public void imprimirInfo() {
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Apellido: " + this.getApellido());
		System.out.println("Edad: " + this.getEdad());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("CI: " + this.getCI());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Barrio: " + this.getBarrio());
	}
	
	public void mudarse(String Departamento, String Barrio) {
		this.Departamento = Departamento;
		this.Barrio = Barrio;
	}
}
