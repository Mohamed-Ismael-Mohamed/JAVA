package CSCORNER;
public class ProduitEcommerce {
	String code;
	String nom;
	double prixHT;
	int stock;
	String categorie;
	static double tauxTVA;
	static double fraisLivraison;
	
	void setcode(String c) {
		code = c;
	}
	void setnom(String n) {
		nom=n;
	}
	void setprixHT(double p) {
		if(p>=0.0) {
			prixHT = p;
		}
		else {
			System.out.println("Valeur invalide");
		}
	}
	void setstock(int s) {
		if(s>=0) {
			stock=s;
		}
		else {
			System.out.println("Valeur invalide");
		}
	}
	void setcategorie(String cat) {
		categorie=cat;
	}
	static void settauxTVA(double t) {
		tauxTVA = t;
	}
	static void setfraisLivraison(double f) {
		fraisLivraison = f;
	}
	String getcode() {
		return code;
	}
	String getnom() {
		return nom;
	} 
	double getprixHT() {
		return prixHT;
	}
	int getstock() {
		return stock;
	}
	String getcategorie() {
		return categorie;
	}
	static double gettauxTVA() {
		return tauxTVA;
	}
	static double getfraisLivraison() {
		return fraisLivraison;
	}
	ProduitEcommerce(){
		code="P000";
		nom="Inconnu";
		prixHT=0;
		stock=0;
		categorie="Divers";
	}
	ProduitEcommerce(String c,String n,double p,int s,String cat){
		code=c;
		nom=n;
		prixHT=p;
		stock=s;
		categorie=cat;
	}
	ProduitEcommerce(String c,String n){
		code=c;
		nom=n;
		prixHT=0;
		stock=0;
		categorie="Divers";
	}
	double calculerPrixTTC() {
		return prixHT+(prixHT*tauxTVA/100);
	}
	double calculerPrixFinal(int quantite, double remisePourcent) {
		if(quantite <= 0) {
			System.out.println("Quantité invalide");
			return 0;
		}
		if(quantite > stock) {
			System.out.println("Stock Insuffisant");
			return 0;
		}
		double montant_HT = prixHT * quantite;
		if(remisePourcent<0) {
			remisePourcent=0;
		}
		double remise = montant_HT * remisePourcent/100;
		double Net_HT = montant_HT - remise;
		double Net_TTC = Net_HT + (Net_HT * tauxTVA/100);
		if(Net_HT >= 20000) {
			return Net_TTC + 0;
		}
		return Net_TTC + fraisLivraison;
	}
	void vendre(int quantite) {
		if(quantite<=0) {
			System.out.println("Erreur quantité Invalide");
			return;
		}
		if(quantite>stock) {
			System.out.println("Stock Insuffisant");
		}
		else {
			stock = stock - quantite;
			System.out.println("Vente OK");
		}
	}
	void afficherProduit() {
		System.out.println("INFORMATION SUR LE PRODUIT\n");
		System.out.println("CODE : "+code);
		System.out.println("NOM : "+nom);
		System.out.println("CATEGORIE : "+categorie);
		System.out.println("PRIX HT : "+prixHT);
		System.out.println("TAUX TVA : "+tauxTVA);
		System.out.println("PRIX TTC : "+calculerPrixTTC());
		System.out.println("STOCK : "+stock);
		System.out.println("FRAIS DE LIVRAISON : "+fraisLivraison);
	}
}
