package entrainement_java;
public class testEnseignant {
	public static void main(String[] args) {
		Enseignant A = new Enseignant("Mohamed Ismael",170000,2022,"INFORMATIQUE");
		Enseignant B = new Enseignant("Ali",10000,2010,"Français");
		Enseignant C = new Enseignant("Ali",10000,2010,"Français");
		
		System.out.println(B==C);
		B.AugmenteSalaire(20000);
		System.out.println("ACCES DIRECTE");
		System.out.println("Salaire de A : "+A.salaire+"|| Salaire de B : "+B.salaire+"|| Salaire de C : "+C.salaire);
		System.out.println("\n");
		System.out.println("ACCES VIA LA METHODE");
		System.out.println("Salaire de A : "+A.getsalaire()+"|| Salaire de B : "+B.getsalaire()+"|| Salaire de C : "+C.getsalaire());
		System.out.println("\n");
		System.out.println("Nombre d'enseignant = "+Enseignant.nombreEnseignant);
		System.out.println("\n");
		Enseignant D = new Enseignant("ADEN",15000,2011,"MATH");
		System.out.println("Nombre d'enseignant = "+Enseignant.nombreEnseignant);
	}
}
