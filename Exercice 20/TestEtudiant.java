package entrainement_java;
public class TestEtudiant {
	public static void main(String[] args) {
		Etudiant E = new Etudiant("Mohamed Ismael",2022,"Informatique L2");
		System.out.println("Numero : "+E.getnumero());
		System.out.println("Nombre d'etudiant Créé = "+Etudiant.donner_nombre_etudiant());
		E.AjouterNote(12);
		E.AjouterNote(14);
		E.AjouterNote(17);
		System.out.println("Note de l'etudiant  : "+E.getnotes());
		System.out.println("Sa Moyenne : "+E.calculer_moy());
		System.out.println("\n");
		Etudiant E1 = new Etudiant("Mohamed Abdi Dirir",2012,"Math L2");
		System.out.println("Numero : "+E1.getnumero());
		System.out.println("\n");
	}
}
