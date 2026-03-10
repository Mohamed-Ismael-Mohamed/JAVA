package entrainement_java;
public class TestArticle {
	public static void main(String[] args) {
		Article a1 = new Article("02212B","Barre en Fer",19.8);
		Article a2 = new Article("320T","Banane");
		a2.set_prixHT(22.32);
		Article a3 = new Article();
		a3.set_designation("Colorant alimentaire");
		a3.set_reference("C432");
		a3.set_prixHT(78);
		System.out.println("Voici le PRIXTTC de l'article 1 : "+a1.CalculerPrixTTC());
		System.out.println("\n");
		System.out.println("Voici le PRIXTTC de l'article 2 : "+a2.CalculerPrixTTC());
		System.out.println("\n");
		System.out.println("Voici le PRIXTTC de l'article 3 : "+a3.CalculerPrixTTC());
		System.out.println("\n");
		System.out.println("Information de l'article A1");
		a1.AfficherArticle();
		System.out.println("\n");
		System.out.println("Information de l'article A2");
		a2.AfficherArticle();
		System.out.println("\n");
		System.out.println("Information de l'article A3");
		a3.AfficherArticle();
	}
}
