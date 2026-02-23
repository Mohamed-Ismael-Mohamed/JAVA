package CSCORNER;
import java.util.ArrayList;
public class magasin {
	ArrayList<produit> product;
	
	magasin(){
		product = new ArrayList<>();
	}
	void ajouter_produit(produit e) {
		product.add(e);
	}
	void afficher_produit() {
		System.out.println("Affichage de tous les produit");
		int i;
		for(i=0;i<product.size();i++) {
			product.get(i).afficher();
		}
	}
	void vendre_produit(int qte, String name) {
		int i;
		for(i=0;i<product.size();i++) {
			if(product.get(i).nom.equals(name)) {
				product.get(i).vendre(qte);
				System.out.println(qte+" de "+name+" vendu avec Succès");
				return;
			}
			else {
				System.out.println("Le produit "+name+" ne se trouve pas dans la liste");
			}
		}
	}
}
