package practicopoo;

public class PracticoPoo {

	public static void main(String[] args) {
		Uruguayo uruguayo = new Uruguayo();
		Chileno chileno = new Chileno();
		Cedula cedula = new Cedula();
		Perro perro = new Perro();
		Chileno chileno2 = new Chileno();
		
		cedula.setNumero(5234243);
		cedula.setDigitoVerificador(54);
		
		uruguayo.setNombre("Juan");
		uruguayo.setApellido("Mendez");
		uruguayo.setEdad(25);
		uruguayo.setSexo('M');
		uruguayo.setCI(cedula);
		uruguayo.setDepartamento("Artigas");
		uruguayo.setBarrio("Centro");
		chileno.setNombre("Paula");
		chileno.setApellido("Perez");
		chileno.setEdad(34);
		chileno.setSexo('F');
		chileno.setDNI("15.765.998");
		chileno.setRegion("Región de Antofagasta");
		chileno.setComuna("El Loa");
		
		perro.setNombre("Negro");
		perro.setRaza("Caniche Toy");
		perro.setSexo('M');
		perro.setEdad(12);
		
		chileno2.setNombre("Fernando");
		chileno2.setApellido("Torres");
		chileno2.setEdad(12);
		chileno2.setSexo('M');
		chileno2.setDNI("15.765.998");
		chileno2.setRegion("Región de Valparaiso");
		chileno2.setComuna("Algarrobo");
		
		System.out.println("Es adulto el perro? " + perro.esAdulto());
		System.out.println("Es adulto el Chileno? " + chileno2.esAdulto());
	}

	public boolean soyUruguayoOChileno(Persona persona) {
		if ((persona instanceof Uruguayo) || (persona instanceof Chileno)) {
			return true;
		}
		return false;
	}
}
