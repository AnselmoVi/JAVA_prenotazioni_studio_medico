package studio_medico;

public class Visita {
	private float costo ;
	private int durata;
	private String codice;
	
	public void Visita(float c, int d, String cd) {
		this.costo=c;
		this.durata=d;
		this.codice=cd;
		
	}
	public void Visita() {}
	
	

	public float getCosto() {
		return this.costo;
	}

	protected void setCosto(float costo) {
		this.costo = costo;
	}

	public int getDurata() {
		return this.durata;
	}

	protected void setDurata(int durata) {
		if (durata>0 && durata <12 ) {
		this.durata = durata;
		}
	}

	public String getCodice() {
		return this.codice;
	}

	void setCodice(String codice) {
		this.codice = codice;
	}
	
	
	
}


