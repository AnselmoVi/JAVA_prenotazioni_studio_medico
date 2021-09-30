package studio_medico;

public class AppuntamentoTicket extends Appuntamento {

	@Override
	public String getNome_paziente() {
		// TODO Auto-generated method stub
		return super.getNome_paziente();
	}

	@Override
	public void setNome_paziente(String nome_paziente) {
		// TODO Auto-generated method stub
		super.setNome_paziente(nome_paziente);
	}

	@Override
	public String getCodice_fiscale() {
		// TODO Auto-generated method stub
		return super.getCodice_fiscale();
	}

	@Override
	public void setCodice_fiscale(String codice_fiscale) {
		// TODO Auto-generated method stub
		super.setCodice_fiscale(codice_fiscale);
	}

	@Override
	public String getCodice_visita() {
		// TODO Auto-generated method stub
		return super.getCodice_visita();
	}

	@Override
	public void setCodice_visita(String codice_visita) {
		// TODO Auto-generated method stub
		super.setCodice_visita(codice_visita);
	}

	@Override
	public int getOrario() {
		// TODO Auto-generated method stub
		return super.getOrario();
	}

	@Override
	public void setOrario(String orario) {
		// TODO Auto-generated method stub
		super.setOrario(orario);
	}


	public void emettiFattura(float prezzo) {
		// TODO Auto-generated method stub
		System.out.println("il costo dell'appuntamento è " + prezzo );
	}
	
	
}
