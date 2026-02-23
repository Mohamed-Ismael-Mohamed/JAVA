package CSCORNER;
public class cercle {
	double rayon;
	Point centre;
	void setrayon(double r) {
		rayon=r;
	}
	void setPoint(Point p) {
		centre = p;
	}
	double getrayon() {
		return rayon;
	}
	Point getPoint() {
		return centre;
	}
	double getPerimetre() {
		return 2*Math.PI*rayon;
	}
	cercle(double r, Point c){
		rayon = r;
		centre = c;
	}
	double getSurface() {
		return Math.PI*Math.pow(rayon,2);
	}
	void appartient(Point p) {
		double distance = Math.sqrt(Math.pow(centre.getx()-p.getx(),2)+Math.pow(centre.gety()-p.gety(),2));
		if (distance <= rayon) {
			System.out.println("Le point appartien au Cercle");
		}
		else {
			System.out.println("Le point n'appartient pas au Cercle !");
		}
	}
	void afficher() {
		System.out.println("Centre d'abscise x = "+centre.getx()+" et d'ordonné y = "+centre.gety());
		System.out.println("RAYON = "+rayon);
	}
}
