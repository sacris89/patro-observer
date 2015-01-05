package patro_observador;

import java.util.ArrayList;
import java.util.List;


public abstract class absEmissor {

	
private List <IObserver> observador = new ArrayList<IObserver>();
	
	public void afegirObservador(IObserver obs) {
		observador.add(obs);
	}
	
	public void publicarSucces (absEmissor clase, String metode){
		for (IObserver obs : observador){
			obs.notificar (clase,metode);
		}
		
	
		
		
	}
	///Metodes abstractes perque les clases xafarder puguin obtenir les dades de les clases mare(controladors)
	public abstract int totalSuma();	
	
}
