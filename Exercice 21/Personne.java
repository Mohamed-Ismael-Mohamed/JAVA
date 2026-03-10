package entrainement_java;
public class Personne {
	String nom;
	int annee_de_naissance;
	Personne(String nom, int annee){
		this.nom = nom;
		annee_de_naissance = annee;
	}
	String getnom() {
		return nom;
	}
	int getAnnee() {
		return annee_de_naissance;
	}
	void setnom(String n) {
		nom=n;
	}
	void setannee(int a) {
		annee_de_naissance = a;
	}
	void AfficherPer() {
		System.out.println("Nom : "+nom+" || Année de naissance = "+annee_de_naissance);
	}
}
