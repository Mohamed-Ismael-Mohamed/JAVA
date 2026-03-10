package entrainement_java;
import java.util.ArrayList;
public class Etudiantt extends Personne{
	ArrayList<Float> notes;
	int numero;
	String filiere;
	static int nombre_etudiant=0;
	
	Etudiantt(String nom, int annee, String filiere){
		super(nom,annee);
		this.filiere = filiere;
		nombre_etudiant++;
		numero = nombre_etudiant;
		notes = new ArrayList<>();
	}
	String get_filiere() {
		return filiere;
	}
	ArrayList<Float> get_notes(){
		return notes;
	}
	int get_numero() {
		return numero;
	}
	void set_filiere(String f) {
		filiere = f;
	}
	void AfficherEtu() {
		super.AfficherPer();
		System.out.println("numero : "+get_numero()+" || filiere : "+get_filiere()+" || Notes = "+get_notes()+"\n");
	}
	void AjouterNote(float a) {
		notes.add(a);
	}
	static int nombre_etudiants() {
		return nombre_etudiant;
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
