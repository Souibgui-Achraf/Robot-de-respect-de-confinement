package monProjet;

import javax.swing.ImageIcon;

public class zoneGeo{
	static int lignes;
	static int colonnes;
	public static obj[][] matrice;//matrice modelisant la zone geo
	window w= mainClass.w;
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
	public void show() {
		ImageIcon img;
		String path ;
	
		for (int i=0;i<zoneGeo.lignes ;i++) {
			for (int j=0; j<zoneGeo.colonnes;j++) {
				path="/";
				if (robot.getxPos()==i&&robot.getyPos()==j) {
					path+="robot";
				}
				if (zoneGeo.matrice[i][j] instanceof personne) {
					path+="homme";
				}
				else if (zoneGeo.matrice[i][j] instanceof animal ) {
					path+="animal";
				}
				else if (zoneGeo.matrice [i][j] instanceof voiture) {
					path+="voiture";
				}
				else {
					path+="void";
				}
				path+=".jpg";
				
				img=new ImageIcon(window.class.getResource(path));
				window.seticon(img, i, j);
			}
		}

	}
	
}
