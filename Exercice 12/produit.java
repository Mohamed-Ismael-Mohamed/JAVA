package CSCORNER;
public class produit {
	String nom;
	double prix;
	int stock;
	
	produit(String n, double p, int s){
		nom = n;
		prix=p;
		stock=s;
	}
	void afficher() {
		System.out.println("Information Sur le Produit");
		System.out.println("Nom : "+nom);
		System.out.println("Prix : "+prix);
		System.out.println("STOCK : "+stock);
	}
	void ajouterStock(int qte) {
		stock +=qte;
	}
	void vendre(int qte) {
		if(qte<=stock) {
			stock -=qte;
		}
		else {
			System.out.println("Stock Insuffisant pour vendre une telle quantité");
		}
	}
}
