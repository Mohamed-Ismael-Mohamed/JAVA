
package CSCORNER;
public class client {
	private String nom;
	private String prenom;
	private String cin;
	public client(String nom,String prenom,String cin) {
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
	}
	public String getnom() {
		return nom;
	}
	public String getprenom() {
		return prenom;
	}
	public String getcin() {
		return cin;
	}
	public String toString() {
		return "Nom : "+nom+"Prenom : "+prenom+"CIN : "+cin;
	}
}
