package CSCORNER;
class Chanson {
	String titre;
	String artiste;
	int dureeSec;
	
	Chanson(){}
	Chanson(String t,String a,int d){
		titre = t;
		artiste = a;
		dureeSec = d;
	}
	String gettitre() {
		return titre;
	}
	String getartiste() {
		return artiste;
	}
	int getdureeSec() {
		return dureeSec;
	}
	void settitre(String t) {
		titre = t;
	}
	void setartiste(String a) {
		artiste = a;
	}
	void setdureeSec(int d) {
		if(d>0) {
			dureeSec = d;
		}
		else {
			System.out.println("La duree doit etre strictement superieur à 0");
		}
	}
	void afficher() {
		System.out.println(titre+"-"+artiste+"("+dureeSec+" sec)");
	}
}
	
	
	
