package studio_medico;

public class Tarifarrio {
	 private Visita[] lista_visita = new Visita[10];
	public void Tariffario() {
		 
		
	}
	public Visita[] getLista_visita() {
		return lista_visita;
	}
	public void setLista_visita( int n) {
		for(int x=0;x<n;x++) {
			for (int y=0; y<this.lista_visita.length;y++) {
				/* cerco il primo vuoto*/
				if (this.lista_visita[y]==null) {
					Visita v=new Visita();
					System.out.println("Nome");
					Input i=new Input();
					v.setCodice(i.getStringa());
					
					System.out.println("Costo");
					v.setCosto(i.getFloat());
					
					System.out.println("durata");
					v.setDurata(i.getInt());
					this.lista_visita[y]=v;
					break;
				}
			}
			
		}
	}
	public Visita equals(Visita v) {
		for(Visita x: this.lista_visita) {
		 if (v.equals(x)) {return x;}
			 
		 
	}
		return null;
}
	
public void stampa() {
	for(Visita v: this.lista_visita) {
		if (v!=null) {
		System.out.println("Visita n°" + v.getCodice()+ " "+ v.getCosto() + " " + v.getDurata() + "\n");}
	}
	

	
}

public int getDurata(String codice)throws VisitaNonTrovata {
	for( Visita v: this.lista_visita) {
		if (v!=null) {
			System.out.println(v.getCodice());
		if (v.getCodice().equalsIgnoreCase(codice))
			return v.getDurata();
		
	}}
	throw new VisitaNonTrovata("Attenzione la visita non è presente!!");
	
	
}
public float getCosto(String codice)throws VisitaNonTrovata {
	for( Visita v: this.lista_visita) {
		if (v.getCodice()==codice)
			return v.getCosto();
		
	}
	throw new VisitaNonTrovata("Attenzione la visita non è presente!!");
	
	
}

	
	
}
