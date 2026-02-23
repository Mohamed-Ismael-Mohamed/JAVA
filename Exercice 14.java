package CSCORNER;
import java.util.Scanner;
class telephone{
	String marque;
	String model;
	float prix;
	telephone(String a, String b, float f){
		marque = a;
		model = b;
		prix = f;
	}
	telephone(){
		marque="inconnu";
		model="inconnu";
		prix=0;
	}
	void afficher() {
		System.out.println("INFORMATION CONCERNANT LE TELEPHONE\n");
		System.out.println("Marque = "+marque+"\n");
		System.out.println("Model = "+model+"\n");
		System.out.println("Prix = "+prix+"\n");
		System.out.println("\n");
	}
	static void memeMarque(telephone A,telephone B) {
		String a,b;
		a=A.marque;
		b=B.marque;
		if(a.equals(b)) {
			System.out.println("Ils ont la meme marque\n");
		}
		else {
			System.out.println("Ils n'ont pas la meme marque\n");
		}
	}
}
public class tp2 {
	public static void main(String[] args) {
		telephone A= new telephone("SAMSUNG","Android",12);
		A.afficher();
		A.model="LINUX";
		A.afficher();
		System.out.println("La marque de ce telephone est : "+A.marque);
		telephone B = new telephone();
		telephone.memeMarque(A,B);
	}

}
