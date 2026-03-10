package entrainement_java;
public class Article {
	String reference;
	String designation;
	double prixHT;
	static double TauxTVA;
	
	String get_reference() {
		return reference;
	}
	String get_designation() {
		return designation;
	}
	double get_prixHT() {
		return prixHT;
	}
	double get_TauxTVA() {
		return TauxTVA;
	}
	void set_reference(String r) {
		reference = r;
	}
	void set_designation(String d) {
		designation = d;
	}
	void set_prixHT(double p) {
		prixHT = p;
	}
	Article(){
	}
	Article(String ref, String des, double prix){
		reference = ref;
		designation = des;
		prixHT = prix;
	}
	Article(String ref, String des){
		reference = ref;
		designation = des;
	}
	
	double CalculerPrixTTC() {
		return prixHT+(prixHT*TauxTVA/100);
	}
	
	void AfficherArticle() {
		System.out.println("Référence = "+get_reference());
		System.out.println("Désignation = "+get_designation());
		System.out.println("PrixHT = "+get_prixHT());
	}
}
