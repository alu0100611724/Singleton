package es.ull.etsii.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import es.ull.etsii.contexto.Robot;
import es.ull.etsii.estrategias.AgressiveBehaviour;
import es.ull.etsii.estrategias.DefensiveBehaviour;
import es.ull.etsii.estrategias.NormalBehaviour;

public class World {

	protected ArrayList<Robot> enjambre;
	
	public World() {
		enjambre = new ArrayList<Robot>();
		crearEstados();
	}
	
	public void crearEstados () {
		
		for (int i=1; i<=10; i++) {
		      
			switch(numAleatorio()) {
		      	case 0: Robot a = new Robot(new AgressiveBehaviour());
		      			 enjambre.add(a);
		      			 break;
		      	case 1: Robot b = new Robot(new DefensiveBehaviour());
	 			 		enjambre.add(b);
	 			 		break;
		      	case 2: Robot c = new Robot(new NormalBehaviour());
	 			 		enjambre.add(c);
	 			 		break;
		      }  
		      System.out.print("Robot "+ i + ": ");
		      enjambre.get(i-1).move();
		}
	}
	
	public void play () {
		
		for (int i=0; i<10; i++) {
		      
			switch(numAleatorio()) {
		      	case 0: Robot a = new Robot(new AgressiveBehaviour());
		      			enjambre.add(i, a);;
		      			break;
		      	case 1: Robot b = new Robot(new DefensiveBehaviour());
	 			 		enjambre.add(i, b);
	 			 		break;
		      	case 2: Robot c = new Robot(new NormalBehaviour());
	 			 		enjambre.add(i, c);
	 			 		break;
		      }  
			  ++i;
		      System.out.print("Robot "+ i + ": ");
		      --i;
		      enjambre.get(i).move();
		}
	}
	
	// Calcula un numero aleatorio entre 0 y 2 incluidos
	public int numAleatorio () {
		Calendar calendario = Calendar.getInstance();
		int semilla = calendario.hashCode();
		Random r = new Random();
	    r.setSeed(semilla);
		return (r.nextInt(3));
	}

}
