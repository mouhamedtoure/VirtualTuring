package fr.demos.formation.virtualturing.utilitaire;

public class Appariement {

	Filtre filtre;
	Donnee donnee;

	public Appariement(Filtre filtre, Donnee donnee) {
		super();
		this.filtre = filtre;
		this.donnee = donnee;
	}

	public boolean filtrage() {

		if (filtre.estVide())

			return donnee.estVide();

		if (donnee.estVide())
			return false;

		if (filtre.elementCourant().equalsIgnoreCase(donnee.elementCourant())) {

			filtre.passeALaSuite();
			donnee.passeALaSuite();
			return this.filtrage();

		}

		else

			return false;
	}

	public Filtre getFiltre() {
		return filtre;
	}

	public void setFiltre(Filtre filtre) {
		this.filtre = filtre;
	}

	public Donnee getDonnee() {
		return donnee;
	}

	public void setDonnee(Donnee donnee) {
		this.donnee = donnee;
	}

}
