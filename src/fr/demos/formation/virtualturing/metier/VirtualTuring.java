package fr.demos.formation.virtualturing.metier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

import fr.demos.formation.virtualturing.utilitaire.Appariement;
import fr.demos.formation.virtualturing.utilitaire.Donnee;
import fr.demos.formation.virtualturing.utilitaire.Filtre;

public class VirtualTuring {

	HashMap<Filtre, ArrayList<String>> univerDuDiscours = new HashMap<Filtre, ArrayList<String>>();

	private String nomTuring = null;

	public void initDiscours() {

		this.univerDuDiscours.put(new Filtre("Bonjour"), new ArrayList<String>(Arrays.asList("Bonjour!", "Salut!", "Hey!")));

		this.univerDuDiscours.put(new Filtre("Comment ça va?"),
				new ArrayList<String>(Arrays.asList("Ça peut aller", "Bien!", "Tranquillement")));

		this.univerDuDiscours.put(new Filtre("Tu fais quoi?"),
				new ArrayList<String>(Arrays.asList("Rien de special et toi?", "Je mange!", "je suis au travail")));

		this.univerDuDiscours.put(new Filtre("Tu deviens quoi?"), new ArrayList<String>(
				Arrays.asList("Virtual Turing", "pourquoi cette question?", "Je ne veux pas te dire")));

	}

	public VirtualTuring(String nom) {
		super();
		this.nomTuring = nom;
		this.initDiscours();
	}

	public String retourneReponse(Donnee question) {

		// System.out.println(question.getContenu());
		String phraseChoisie = null;

		Iterator<Filtre> iterator = univerDuDiscours.keySet().iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next().getContenu());
			Filtre filtre=iterator.next();
			Appariement appariement = new Appariement(filtre, question);
			
			

			if (appariement.filtrage()) {

				ArrayList<String> list = this.univerDuDiscours.get(filtre);

				int indexChoix = (int) (Math.random() * list.size());

				phraseChoisie = list.get(indexChoix);
				break;
			}
			if (phraseChoisie == null)
				phraseChoisie = "Je n'ai rien compris du tout...";
		}

		return phraseChoisie;
	}

	public String getNomTuring() {
		return nomTuring;
	}

	public void setNomTuring(String nomTuring) {
		this.nomTuring = nomTuring;
	}

	public Filtre construitFiltre(String chaineFiltre) {

		StringTokenizer token = new StringTokenizer(chaineFiltre, " ,;:.!'\"?");
		ArrayList<String> liste = new ArrayList<String>();
		while (token.hasMoreTokens()) {
			liste.add(token.nextToken());
		}

		return new Filtre(liste);

	}

}
