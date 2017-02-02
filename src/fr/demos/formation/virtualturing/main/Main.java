package fr.demos.formation.virtualturing.main;

import java.util.ArrayList;
import java.util.HashMap;

import fr.demos.formation.virtualturing.metier.VirtualTuring;
import fr.demos.formation.virtualturing.utilitaire.Appariement;
import fr.demos.formation.virtualturing.utilitaire.Donnee;
import fr.demos.formation.virtualturing.utilitaire.Filtre;

public class Main {

	public static void main(String[] args) {

		HashMap <String, String> univerDuDiscours = new HashMap <String, String>();
		VirtualTuring virtual = new VirtualTuring(univerDuDiscours);
		virtual.initDiscours();


		Donnee donnee = virtual.virtualTuring(univerDuDiscours);

		System.out.println(donnee.getContenu());

		ArrayList<String> list = new ArrayList<String>();
		list.add("Je");
		list.add("vais");
		list.add("a");
		list.add("la");
		list.add("plage");

		Filtre filtre = new Filtre(list);
		
		System.out.println(filtre.getContenu());

		Appariement ap = new Appariement(filtre, donnee);
		
		
		System.out.println(ap.filtrage());
		
	}
	
}
