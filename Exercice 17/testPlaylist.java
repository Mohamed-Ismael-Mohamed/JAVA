package CSCORNER;
public class testPlaylist {
	public static void main(String[] args) {
		Utilisateur A = new Utilisateur("ABDI");
		Playlist a = new Playlist("Shark","Mohamed Ismael");
		Playlist b = new Playlist("Boomer","Khalid");
		
		Chanson c1 = new Chanson("Cnew","THE rock",120);
		Chanson c2 = new Chanson("alhilal","ronaldo",130);
		Chanson c3 = new Chanson("manchester","turing",170);
		a.ajouterChanson(c1);
		a.ajouterChanson(c2);
		a.ajouterChanson(c3);
		
		Chanson c7 = new Chanson("HELLA","Rahma Dayax",180);
		Chanson c8 = new Chanson("XEER CISE","Charmaboy",190);
		b.ajouterChanson(c7);
		b.ajouterChanson(c8);
		
		a.afficherPlaylist();
		b.afficherPlaylist();
		
		System.out.println("Playlist A || Durée Totale : "+a.dureeTotal());
		System.out.println("Playlist B || Durée Totale : "+b.dureeTotal());
		
		boolean resultat = a.contientTitre("Cnew");
		if(resultat == true) {
			System.out.println("Le Titre se trouve bien dans la Liste a");
		}else {
			System.out.println("Introuvable dans la Liste a");
		}
		a.supprimerChanson(0);
		System.out.println("Apres La Supression");
		a.afficherPlaylist();
	}
}
