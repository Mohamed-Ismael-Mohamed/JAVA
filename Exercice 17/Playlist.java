package CSCORNER;
import java.util.ArrayList;
class Playlist {
	String nom;
	ArrayList<Chanson> chansons;
	String proprietaire;
	static int nbplaylists=0;
	Playlist(){}
	Playlist(String nom, String proprietaire){
		this.nom = nom;
		this.proprietaire = proprietaire;
		chansons = new ArrayList<>();
		nbplaylists++;
	}
	void ajouterChanson(Chanson c) {
		if(c!= null) {
			chansons.add(c);
		}
	}
	void supprimerChanson(int index) {
		if(index>=0 && index<chansons.size()) {
			chansons.remove(index);
		}
		else {
			System.out.println("Index non valide !");
		}
	}
	void afficherPlaylist() {
		int i;
		System.out.println("Affichage de la playlist");
		System.out.println("Nom de la playlist : "+nom+" || proprietaire : "+proprietaire);
		for(i=0;i<chansons.size();i++) {
			System.out.println("Chanson numero "+(i+1));
			chansons.get(i).afficher();
		}
	}
	int dureeTotal() {
		int i;
		int somme = 0;
		for(i=0;i<chansons.size();i++) {
			somme = somme + chansons.get(i).getdureeSec();
		}
		return somme;
	}
	boolean contientTitre(String titre) {
		int i;
		for(i=0;i<chansons.size();i++) {
			if(chansons.get(i).titre.equalsIgnoreCase(titre)) {
				return true;
			}
		}
		return false;
	}
}
