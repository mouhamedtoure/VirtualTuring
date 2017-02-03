package fr.demos.formation.virtualturing.utilitaire;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Element {

	ArrayList<String> contenu;
	int index = 0;

	public Element() {
		super();
	}

	public Element(ArrayList<String> contenu) {
		super();
		this.contenu = contenu;
		this.index = 0;
	}

	public Element(String chaine) {
		StringTokenizer token = new StringTokenizer(chaine, " ,;:.!'\"?");
		contenu = new ArrayList<String>();
		while (token.hasMoreTokens()) {
			contenu.add(token.nextToken());
		}
	}

	public boolean estVide() {

		return index == contenu.size();

	}

	public ArrayList<String> getContenu() {
		return contenu;
	}

	public void setContenu(ArrayList<String> contenu) {
		this.contenu = contenu;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void passeALaSuite() {

		this.index++;

	}

	public String elementCourant() {

		if (this.estVide())
			return null;

		else {
			return contenu.get(index);

		}
	}

}
