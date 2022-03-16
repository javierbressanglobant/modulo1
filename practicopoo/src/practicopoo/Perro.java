package practicopoo;

public class Perro implements SerVivo{

	private String Nombre;
	private String Raza;
	private int edad;
	private char sexo;
	
	public Perro() {
		
	}
	public void cumpleaños() {
		this.setEdad(this.getEdad() + 1);
	}

	public boolean esAdulto() {
		boolean resultado = false;
		
		if(this.getEdad() > 3) {
			resultado = true;
		}
		return resultado;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getRaza() {
		return Raza;
	}

	public void setRaza(String raza) {
		Raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
