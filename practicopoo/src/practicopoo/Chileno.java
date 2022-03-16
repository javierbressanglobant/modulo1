package practicopoo;

public class Chileno extends Persona{

	private String DNI;
	private String Region;
	private String Comuna;
	
	public Chileno() {
		
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		this.DNI = dNI;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		this.Region = region;
	}

	public String getComuna() {
		return Comuna;
	}

	public void setComuna(String comuna) {
		this.Comuna = comuna;
	}
}
