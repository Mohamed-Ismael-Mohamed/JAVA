package entrainement_java;
import java.util.ArrayList;
public class Bibliotheque{
	String nom_biblio;
	ArrayList<Livres> liste_livres;
	
	Bibliotheque(String nom){
		nom_biblio = nom;
		liste_livres = new ArrayList<>();
	}
	
	void ajouterLivre(String titre, String auteur) {
		Livres l = new Livres(titre,auteur);
		liste_livres.add(l);
	}
	void afficherLivres() {
		int i;
		for(i = 0; i<liste_livres.size();i++) {
			System.out.println("Livre numero "+(i+1));
			System.out.println("Titre = "+liste_livres.get(i).titre+" || Auteur = "+liste_livres.get(i).auteur);
			System.out.println("\n");
		}
	}
	
	void rechercherLivre(String titre, String auteur) {
		int i;
		for(i = 0; i<liste_livres.size();i++) {
			if (liste_livres.get(i).titre.equals(titre) && liste_livres.get(i).auteur.equals(auteur)) {
				System.out.println("Trouvée");
				return;
			}
		}
		System.out.println("Le Livre ne se trouve pas dans la liste !");
	}
	void supprimerLivre(String titre, String auteur) {
		int i;
		for(i = 0; i<liste_livres.size();i++) {
			if (liste_livres.get(i).titre.equals(titre) && liste_livres.get(i).auteur.equals(auteur)) {
				liste_livres.remove(i);
				System.out.println("Livre Supprimer !");
				return;
			}
		}
		System.out.println("Veuillez saisir un livre qui se trouve dans le Liste svp");
	}
	void modifierLivre(String titre, String nouveau_titre) {
		int i;
		for(i = 0; i<liste_livres.size();i++) {
			if (liste_livres.get(i).titre.equals(titre)) {
				liste_livres.get(i).titre = nouveau_titre;
				System.out.println("Livre modifier !");
				return;
			}
		}
		System.out.println("Veuillez saisir un titre qui se trouve dans le Liste svp");
	}
	void effacerLivres() {
		if(liste_livres.isEmpty()) {
			System.out.println("La liste est vide");
		}
		else {
			liste_livres.clear();
		}
	}
}
