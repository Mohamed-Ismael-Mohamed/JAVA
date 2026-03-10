package entrainement_java;
public class Enseignant {
	String nom;
	double salaire;
	String matiere;
	int annee_embauche;
	static int nombreEnseignant = 0;
	
	Enseignant(String nom, double salaire, int annee_embauche, String matiere){
		this.nom = nom;
		this.salaire = salaire;
		this.annee_embauche = annee_embauche;
		this.matiere = matiere;
		nombreEnseignant++;
	}
	void AugmenteSalaire(double x) {
		salaire = salaire + x;
	}
	double getsalaire(){
		return salaire;
	}
}
