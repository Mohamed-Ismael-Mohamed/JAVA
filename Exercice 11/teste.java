package CSCORNER;
public class teste {
	public static void main(String[] args) {
		client A = new client("Mohamed","Ismael","220001285");
		client B = new client("Ahmed","Aden","240001287");
		CompteBancaire a = new CompteBancaire(A,1000);
		CompteBancaire b = new CompteBancaire(B);
		System.out.println("Affichage du Compte a");
		System.out.println(a);
		System.out.println("Affichage du Compte b");
		System.out.println(b);
		b.deposer(500);;
		a.retirer(200);
		a.transferer(b,300);
		b.transferer(a);
		System.out.println("Affichage du Compte a");
		System.out.println(a);
		System.out.println("Affichage du Compte b");
		System.out.println(b);
		System.out.println("TOTALE ARGENT DANS LA BANQUE = "+CompteBancaire.gettotalArgentDansLaBanque());
	}

}
