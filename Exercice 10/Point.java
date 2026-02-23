package CSCORNER;
public class Point {
	double x;
	double y;
	void setx(double x) {
		this.x = x;
	}
	void sety(double y) {
		this.y = y;
	}
	double getx() {
		return x;
	}
	double gety() {
		return y;
	}
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	void afficher() {
		System.out.println("Coordonné du POINT ");
		System.out.println("X = "+getx());
		System.out.println("Y = "+gety());
	}
}
