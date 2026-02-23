package CSCORNER;
public class test {
	public static void main(String[] args) {
		Point A = new Point(12.5,16.5);
		A.afficher();
		cercle Cletus = new cercle(14.00,A);
		System.out.println("Perimètre : "+Cletus.getPerimetre());
		Cletus.afficher();
		Cletus.getPoint().afficher();
		Point B = new Point(70,70);
		Cletus.appartient(B);
	}

}
