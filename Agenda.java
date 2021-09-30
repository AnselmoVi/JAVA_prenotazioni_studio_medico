package studio_medico;

public class Agenda {
	public Appuntamento[] lista_appuntamenti= new Appuntamento[12];
	
	public Agenda() {}
	
	public void inserisciAppuntamento(Appuntamento app,int durata) throws ExcedAppuntamenti {
		int slot=app.getOrario(); /*riceve lo slot di partenza, es 5, ma non conosco la durata, in quanto è salvata nella visita. Nel'appuntamento ho il codice visita, quindi lo passo all'agenda dal main ( se non voglio fare v.d'classe) */ 
		if(durata+(app.getOrario())>12) {
			 throw new ExcedAppuntamenti("HAi superato il numero di appuntamenti per oggi");
			
		}
		for (int x=0;x<durata;x++) {
			int y=app.getOrario();
			if (this.lista_appuntamenti[y]==null) {
			this.lista_appuntamenti[y]=app;}
			else {
				System.out.println("Spiacenti non c'è posto");
			}
		}
		/* inserisci l'eccezione se durata+getOrario supera 12 */
		
		
	}
	
	public void  stampa() {
		for (Appuntamento a: this.lista_appuntamenti) {
			if(a!= null) {
			System.out.println("app. n" + a.getCodice_fiscale() + " " + a.getNome_paziente() + " " + a.getCodice_visita() + "\n");
			}
		}
	}
	
	public Appuntamento getAppuntamento(String cv) throws AppuntamentoNonTrovato{
		
		for (Appuntamento a: this.lista_appuntamenti) {
			if(a!=null) {
			if(a.getCodice_fiscale()==cv)
				return a;
		}}
		throw new AppuntamentoNonTrovato("spiacente nessun appuntamento per lei");
	
		
	}
	
	
}
