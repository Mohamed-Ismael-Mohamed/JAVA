package CSCORNER;

import java.util.Scanner;
class livre{
	String Titre;
	String Auteur;
	double prix;
	livre(String a,String b,double c){
		Titre=a;
		Auteur=b;
		prix=c;
	}
	void setcode(String h) {
		Titre=h;
	}
	String getcode() {
		return Auteur;
	}
	void afficher() {
		System.out.println("Information du Livre\n");
		System.out.println("Titre = " + Titre);
		System.out.println("Auteur = " + Auteur);
		System.out.println("Prix = " + prix);
	}
	static void meme_auteur(livre B, livre A) {
		if(B.Auteur.equals(A.Auteur)) {
			System.out.println("Les Deux Objets ont le meme Auteur");
		}
		else {
			System.out.println("Il n'ont pas le meme Auteur");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		livre A = new livre("En eaux Trouble","The Rock",12.99);
		livre B;
		String a,b;
		System.out.println("Saisir le Titre du livre : ");
		a=sc.nextLine();
		System.out.println("Saisir le Nom de l'auteur : ");
		b=sc.nextLine();
		System.out.println("Saisir le Prix du livre : ");
		double prix=sc.nextDouble();
		B = new livre(a,b,prix);
		A.afficher();
		B.afficher();
		livre.meme_auteur(B,A);
	}

}

