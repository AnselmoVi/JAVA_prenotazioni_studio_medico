package studio_medico;

public class main {

	static final String s0="0 per terminare ";
	static final String s1="1 per aggiungere una visita \n";
	static final String s3="2 per stampare il tarifarrio \n";
	static final String s4="3 per aggiungere un appuntamento \n";
	static final String s5="4 stampa l'agenda del giorno \n";
	static final String s6="5 Emetti fattura \n";
	static final String s7=" premi 1 A pagamento \n";
	static final String s8="premi 2 A con esenzione \n";
	static final String s9="Inserisci il codice della vsita \n";
	static final String s10="Inserisci il codice fiscale \n";
	
	
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Input input=new Input();
		Tarifarrio t=new Tarifarrio();
		Agenda a=new Agenda();
		
		boolean fine=true;
		do{
			menu();
			int scelta=input.getInt();
			switch(scelta) {
			case 0: fine=false;
			break;
			case 1:
				System.out.println("Quante visite vuoi inserire?");
				int n=input.getInt();
				t.setLista_visita(n);
				break;
			
			
			case 2:
				t.stampa();
			break;
			case 3:
				System.out.println("che tipo di vista vuoi fare? " + s7 +" o " + s8);
				int ninput= input.getInt();
				System.out.println("Inserisci il tuo codice fisale \n");
				String cv=input.getStringa();
				System.out.println("Inserisci il tuo nome \n");
				String nome=input.getStringa();
				System.out.println("Inserisci il tuo codice visita\n ");
				String codice_visita=input.getStringa();
				System.out.println(codice_visita);
				System.out.println("Inserisci l'orario fomrato xx:xx hh-mm \n");
				String orario=input.getStringa();
				/*mi serve adesso solo la durata della visita dell'appuntamento. La trovo nel tarif */
				int d=0;
				try {
					d=t.getDurata(codice_visita);
					
				}
				catch ( VisitaNonTrovata e) {
					System.out.println(e.getMessage());
				}
				
				if(ninput==1) {
					System.out.println("sono in app.tick");
					AppuntamentoTicket app= new AppuntamentoTicket();
					app.setCodice_fiscale(cv);
					app.setCodice_visita(codice_visita);
					app.setOrario(orario);
					app.setNome_paziente(nome);
					try {
						a.inserisciAppuntamento(app, d);
					} catch (ExcedAppuntamenti e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					break;
				}
				if(ninput==2) {
					System.out.println("sono in app.NO tick");
					AppuntamentoNoTicket app= new AppuntamentoNoTicket();
					app.setCodice_fiscale(cv);
					app.setCodice_visita(codice_visita);
					app.setOrario(orario);
					app.setNome_paziente(nome);
					try {
						a.inserisciAppuntamento(app, d);
					} catch (ExcedAppuntamenti e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					break;
					
					
				}
				break;
				
			case 4:
				a.stampa();
				break;
			case 5: 
				Appuntamento app = null;
				 System.out.println("Il suo codice fiscalae? \n ");
				 cv=input.getStringa();
				 try {
					app=a.getAppuntamento(cv);
				} catch (AppuntamentoNonTrovato e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 try {
					app.emettiFattura(t.getCosto(app.getCodice_visita()));
				} catch (VisitaNonTrovata e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
		
			}
			
				
			
				}while(fine);
			
			
		
	}
	
	public static void menu() {
		System.out.println("Scegli cosa fare: \n +" + s0 + s1+s3+s4+s5+s6);
		
		
	}
}
