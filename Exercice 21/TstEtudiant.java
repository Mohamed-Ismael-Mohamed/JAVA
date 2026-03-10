package entrainement_java;
public class TstEtudiant {
	public static void main(String[] args) {
		Etudiantt E = new Etudiantt("Mohamed Ismael",2027,"Informatique");
		System.out.println("Numero : "+E.get_numero());
		System.out.println("Nom : "+E.getnom());
		E.setannee(2020);
		E.AjouterNote(10);
		E.AjouterNote(11);
		E.AjouterNote(12);
		E.AjouterNote(13);
		System.out.println("Notes = "+E.get_notes());
		System.out.println("Moyenne = "+E.calculer_moy());
		System.out.println("\n");
		E.AfficherEtu();
		
	}
}
