package CSCORNER;
public class CompteBancaire {
	private int numeroCompte;
	private double solde;
	private client titulaire;
	private static int compteur=0;
	private static double totalArgentDansLaBanque = 0;
	public CompteBancaire(client titulaire){
		this.titulaire = titulaire;
		solde=0;
		compteur++;
		numeroCompte = compteur;
	}
	public CompteBancaire(client titulaire, double soldInitiale){
		this.titulaire = titulaire;
		compteur++;
		numeroCompte = compteur;
		if(soldInitiale<0) {
			solde=0;
		}
		else {
			solde = soldInitiale;
			totalArgentDansLaBanque = totalArgentDansLaBanque + solde;
		}
	}
	public int getnumeroCompte() {
		return numeroCompte;
	}
	public double getsolde() {
		return solde;
	}
	public client gettitulaire() {
		return titulaire;
	}
	public void deposer(double montant) {
		if(montant>0) {
			solde = solde + montant;
			totalArgentDansLaBanque = totalArgentDansLaBanque + montant;
		}
	}
	public void retirer(double montant) {
		if(montant>0 && montant<=solde) {
			solde = solde - montant;
			totalArgentDansLaBanque = totalArgentDansLaBanque - montant;
		}
	}
	public void transferer(CompteBancaire destination, double montant) {
		destination.deposer(montant);
		retirer(montant);
	}
	public void transferer(CompteBancaire destination) {
		destination.deposer(solde);
		retirer(solde);
	}
	public static double gettotalArgentDansLaBanque() {
		return totalArgentDansLaBanque;
	}
	public String toString() {
		return "Numero Compte : "+getnumeroCompte()+" / Solde : "+getsolde()+" / titulaire : " + gettitulaire().getnom()+ " "+gettitulaire().getprenom();
	}
}
