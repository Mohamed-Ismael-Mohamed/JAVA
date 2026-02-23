package CSCORNER;
public class testProduitEcommerce {
	public static void main(String[] args) {
		ProduitEcommerce.settauxTVA(10);
		ProduitEcommerce.setfraisLivraison(500);
		ProduitEcommerce A = new ProduitEcommerce();
		ProduitEcommerce B = new ProduitEcommerce("0221287","Chaise de luxe",12.99,20,"Meuble");
		ProduitEcommerce C = new ProduitEcommerce("XARG10","Taxi");
		A.setcategorie("Maison de Retraite");
		A.afficherProduit();
		B.afficherProduit();
		C.afficherProduit();
		System.out.println(A.calculerPrixFinal(0,12.3));
		B.vendre(7);
	}

}
