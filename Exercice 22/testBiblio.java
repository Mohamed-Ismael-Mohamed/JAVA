package entrainement_java;
public class testBiblio {
	public static void main(String[] args) {
		Bibliotheque B = new Bibliotheque("Mohamed Ismael");
		B.ajouterLivre("Cité d'or", "Dortemund");
		B.ajouterLivre("Voila", "Aimé Césaire");
		B.ajouterLivre("Papa ou t'est ?", "Stromae");
		B.afficherLivres();
		B.rechercherLivre("Papa ou t'est ?","Stromae");
		B.supprimerLivre("Cité d'or", "Dortemund");
		B.modifierLivre("Voila","LASSA");
		B.afficherLivres();
		B.effacerLivres();
		B.afficherLivres();
	}
}
