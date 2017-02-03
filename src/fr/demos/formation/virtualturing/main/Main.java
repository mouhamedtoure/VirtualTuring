package fr.demos.formation.virtualturing.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

import fr.demos.formation.virtualturing.metier.VirtualTuring;
import fr.demos.formation.virtualturing.utilitaire.Appariement;
import fr.demos.formation.virtualturing.utilitaire.Donnee;
import fr.demos.formation.virtualturing.utilitaire.Filtre;
import fr.demos.formation.virtualturing.utilitaire.Lecteur;

public class Main {

	public static void main(String[] args) {

		// HashMap<String, ArrayList<String>> univerDuDiscours = new
		// HashMap<String, ArrayList<String>>();

		VirtualTuring virtual = new VirtualTuring("Turing");
		// virtual.initDiscours();

		while (true) {

			String question = Lecteur.lireLigne();

			Donnee donnee = new Donnee(question);
			String reponse = virtual.retourneReponse(donnee);

			if (question.equalsIgnoreCase("fin"))
				break;

			System.out.println(virtual.getNomTuring() + " : " + reponse);

		}
	}
}
