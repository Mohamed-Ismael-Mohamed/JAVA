package CSCORNER;
import java.util.ArrayList;
public class Utilisateur {
	String nom;
	ArrayList<Playlist> playlists;
	Utilisateur(String nom){
		this.nom = nom;
		playlists = new ArrayList<>();
	}
	void creerPlaylist(String nomplaylist) {
		Playlist a = new Playlist(nomplaylist,this.nom);
		playlists.add(a);
	}
	void afficherToutesPlaylists() {
		int i;
		System.out.println("Affichage des Playlists");
		for(i=0;i<playlists.size();i++) {
			System.out.println("Playlists numero "+(i+1));
			playlists.get(i).afficherPlaylist();
		}
	}
}
