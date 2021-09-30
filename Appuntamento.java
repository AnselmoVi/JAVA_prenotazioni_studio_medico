package studio_medico;

public abstract  class Appuntamento  {
	private String nome_paziente;
	private String codice_fiscale;
	private String codice_visita;
	private String orario;
	public Appuntamento() {}
	public String getNome_paziente() {
		return nome_paziente;
	}
	public void setNome_paziente(String nome_paziente) {
		this.nome_paziente = nome_paziente;
	}
	public String getCodice_fiscale() {
		return codice_fiscale;
	}
	public void setCodice_fiscale(String codice_fiscale) {
		this.codice_fiscale = codice_fiscale;
	}
	public String getCodice_visita() {
		return codice_visita;
	}
	public void setCodice_visita(String codice_visita) {
		this.codice_visita = codice_visita;
	}
	public int getOrario() {
		String[] or=this.orario.split(":");
		int ora=Integer.parseInt(or[0]);
		int minutes=Integer.parseInt(or[1]);
		System.out.println("ore:" + ora + "minuti" + minutes);
		int slot=(ora-8)*2;
		if(minutes>0) {
			slot=slot+1;}
		System.out.println("slot:" + slot);
		return slot ;	
		
	}
	
	public void setOrario(String orario) {
		this.orario = orario;
	}
	
	public void emettiFattura(float prezzo) {
		
	}

	
	
	
	
}
