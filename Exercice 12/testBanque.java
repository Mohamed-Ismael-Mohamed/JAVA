package entrainement_java;
public class testBanque {
	public static void main(String[] args) {
		Client C1 = new Client("Mohamed","Ismael","030B1");
		Client C2 = new Client("AHMED","Youssouf","2212CI");
		
		CompteBancaire B1 = new CompteBancaire(C1,1000);
		CompteBancaire B2 = new CompteBancaire(C2);
		
		System.out.println(B1);
		System.out.println(B2);
		
		B2.deposer(500);
		B1.retirer(200);
		B1.transferer(B2,300);
		B2.transferer(B1);
		System.out.println("\n");
		System.out.println("\n");
		System.out.println(B1);
		System.out.println(B2);
	}

}
