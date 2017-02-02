package fr.demos.formation.virtualturing.metier;

import java.util.ArrayList;
import java.util.HashMap;

import fr.demos.formation.virtualturing.utilitaire.Donnee;
import fr.demos.formation.virtualturing.utilitaire.Lecteur;

public class VirtualTuring {
	
	HashMap<String, String> univerDuDiscours;
	String nomTuring= "Virtual Turing";
	
	public void initDiscours(){
		
		this.univerDuDiscours.put("Bonjour", "Bonjour!");
		this.univerDuDiscours.put("Comment ça va?", "Ça va bien et toi?");
		this.univerDuDiscours.put("Tu fais quoi?",  "Rien de spécial et toi?");
		this.univerDuDiscours.put("Je vais a la plage", "C'est bien, il fait beau en plus");
		this.univerDuDiscours.put("Profite bien", "Merci");
		
		
	}
	public VirtualTuring(HashMap<String, String> univerDuDiscours) {
		super();
		this.univerDuDiscours = univerDuDiscours;
	}

	
	public Donnee virtualTuring(HashMap<String, String> univerDuDiscours) {

		String ligneLue;
		
		
	//	while (true) {
			
			ligneLue = Lecteur.lireLigne();
			System.out.println("Mouhamed: " + ligneLue);
			int indexChoix = (int)(Math.random ()*univerDuDiscours.size ());
		    String phraseChoisie = univerDuDiscours.get(indexChoix);
			System.out.println(nomTuring+":" + phraseChoisie);
//			if (ligneLue.equalsIgnoreCase("fin"))
//				break;
//			
//		}
//		
		
		Donnee donnee = new Donnee(Lecteur.recupLigne());
		
		return donnee;

	}
	
	
}
