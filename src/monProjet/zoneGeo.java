package monProjet;

public class zoneGeo{
	static int lignes;
	static int colonnes;
	static obj[][] matrice;//matrice modelisant la zone geo
	public void create (int n,int m) {//creation de la zone geo
		matrice =new obj[n][m];
		lignes =n;
		colonnes=m;
	}
	public void add(obj objet) {//ajout d un objet a la zone
		matrice[objet.x][objet.y]=objet;
	}
	public obj getObj(int x,int y) {
		//renvoi l obj a la pos x,y
		return matrice[x][y];
	}
	public void show() {//affichage de la zone geo
		System.out.println("*********************************************");
		System.out.println(" ***********\\ ZONE GEOGRAPHIQUE /***********");
		System.out.println("  *****************************************");
		System.out.print("  **   ");
		for(int i=0;i<colonnes*3+1;i++) System.out.print("_");
		System.out.println("   **");
		for (int i=0;i<lignes;i++) {
			System.out.print("  **   |");
			for (int j=0; j<colonnes;j++) {
				char c=' ';//afficher le robot
				if (robot.getxPos()==i&&robot.getyPos()==j) c='R';
				if (matrice[i][j] instanceof personne) System.out.print(c+"P"+"|");
				else if (matrice[i][j] instanceof animal ) System.out.print(c+"A"+"|");
				else if (matrice [i][j] instanceof voiture) System.out.print(c+"V"+"|");
				else System.out.print(c+"-"+"|");
			}
		System.out.println("   **");			
		}
		System.out.println("  **   *******************************   **");
		System.out.println("  **                                     **");
		System.out.println("  *****************************************");
		//System.out.println("  *****************************************");
	}
}
