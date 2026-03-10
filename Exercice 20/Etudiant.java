package entrainement_java;
import java.util.ArrayList;
public class Etudiant {
	String nom;
	ArrayList<Float> notes;
	int annee_de_naissance;
	int numero;
	String Filiere;
	static int nb_etudiant=0;
	
	Etudiant(String nom, int annee, String filiere){
		this.nom = nom;
		notes = new ArrayList<>();
		annee_de_naissance = annee;
		Filiere = filiere;
		nb_etudiant++;
		numero = nb_etudiant;
	}
	String getnom() {
		return nom;
	}
	ArrayList<Float> getnotes() {
		return notes;
	}
	int getanneedenaissance() {
		return annee_de_naissance;
	}
	int getnumero() {
		return numero;
	}
	String getFiliere() {
		return Filiere;
	}
	static int donner_nombre_etudiant() {
		return nb_etudiant;
	}
	void setnom(String n) {
		nom = n;
	}
	void setannee_de_naissance(int annee) {
		annee_de_naissance = annee;
	}
	void setFiliere(String f) {
		Filiere = f;
	}
	void afficher() {
		System.out.println("Numero : "+getnumero() );	
		System.out.println("nom : "+getnom());
		System.out.println("Annee de Naissance : "+getanneedenaissance());
		System.out.println("Filiere : "+getFiliere());
		System.out.println("Notes : "+getnotes());	
	}
	void AjouterNote(float a) {
		notes.add(a);
	}
	float calculer_moy() {
		int i;
		float s=0;
		for(i=0;i<notes.size();i++) {
			s = s + notes.get(i);
		}
		return s/notes.size();
	}
}
