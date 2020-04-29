package monProjet;

public class robot {
	
	static int startX;//pos depart robot
	static int startY;//pos depart robot
	static int xPos; // x lignes position ou se trouve le robot
	static int yPos; // y colonnes position ou se trouve le robot
	static boolean lignesPaires =(zoneGeo.lignes%2==0);
	static boolean fin=false ; //fin de parcours ==false
	static boolean sensParcours;//sens de parcours horizontale de la zone: gauche a droite = true 
	static boolean sensParcoursV;//sens parcours vericale : haut vers bas = true 
	
	
	public robot (int x,int y) {//constructeur
		//initialisations du position du robot
		startX=x;
		startY=y;
		xPos=x;
		yPos=y;
		//initialisation des sens de parcours du robot
		if (startX==0) sensParcoursV=true;//sens du haut vers bas
		else sensParcoursV=false;//sens du bas vers haut
		if(startY==0) sensParcours=true;//du gauche vers droite
		else sensParcours=false;//du droite vers gauche
		
	}
	public static int getxPos() {
		return xPos;
	}
	public static int getyPos() {
		return yPos;
	}
	static zoneGeo zone=new zoneGeo();
	static obj test;//l objet où se trouve le robot
	static boolean autorisation ;
	
	public static void parcours ()	{
		//methode de parcours du robot (incrementation des xPos et yPos
		zone.show();//afficher la zone geo
		System.out.println("Robot dans la position : "+ (xPos+1)+" - "+(yPos+1));
		testEmplacement(xPos,yPos);//le robot teste cet emplacement
		if (testFinParcours()) {// les point finales du parcours
			fin=true;
			return;
		}
		if (yPos==zoneGeo.colonnes-1&&sensParcours||yPos==0&& !sensParcours) { 
			// 1ere et derniere colonne
			//si le robot avance du gauche vers droite et on atteint la derniere colonne
			//ou du droite vers gauche et on atteint la 1ere colonne
			if( sensParcoursV) xPos++;
			//et si du haut vers bas  : ypos reste la meme et xpos augmente
			else xPos--;
			sensParcours=!sensParcours;//et on inverse le sens de parcours horizontale
			parcours();//appel recursive avec les nouveaux positions xPos et yPos
			return; //pour ne pas effectuer d autres instructions apres l appel recursif
		}
		if (sensParcours ) {//reste du matrice
			//si de gauche vers droite yPos augmente
			yPos++;
			parcours();
			return;
		}
		else{//reste du matrice aussi
			//si de droite vers gauche yPos diminue
			yPos--;
			parcours();
			return;
		}
	}
	public static void testEmplacement(int x,int y) {
		//tester la position actuelle et afficher les messages necessaires
		//System.out.println("Robot dans la position x= "+(x+1) +" y= "+ (y+1) );
		test=zone.getObj(x,y) ;//l objet où se trouve le robot
		if (test!=null) { //il y'a une personne ou un animal ou une voitue
		autorisation =test.check();
		if (test instanceof personne) {//s'il y a une personne
			System.out.println("Robot: Montrer-moi votre motif de sortie !");
			if (autorisation) {
				System.out.println("Personne: Voici mon motif");
				System.out.println("Robot: Vous pouvez passer !");
			}
			else {
				System.out.println("Personne: J'en ai pas");
				System.out.println("Robot: Vous n'avez pas le droit de circuler sans autorisation pendant le confinement !");
			}
		}
		if (test instanceof voiture) {//s'il y a une voiture
			System.out.println("Robot: Montrer moi votre motif de circulation !");
			if (autorisation) {
				System.out.println("Conducteur: Voici mon motif de circulation");
				System.out.println("Robot Vous pouvez passer !");
			}
			else {
				System.out.println("Conducteur: J'en ai pas");
				System.out.println("Robot: Vous n'avez pas le droit de circuler sans autorisation pendant le confinement !");
			}
		}
		if (test instanceof animal ) {//s'il y a un animal
			System.out.println("C'est un animal"	);
		}
		}
		else System.out.println("Le robot continue son trajet normalement");//s'il y a rien
		System.out.println("");
	}
	
	
	public static boolean testFinParcours() {
		// tester si on atteint fin de parcours
		if (startX==0 && xPos==zoneGeo.lignes-1) {
			if (lignesPaires) {
				if (yPos==startY) {
					//startX=0 et startY=0 ou startY=colonnes-1 et lignes paires
					//--> finX=lignes-1 et finY=startY
					return true ;
				}
			}
			else //si lignes impaires
				if ((yPos==zoneGeo.colonnes-1&&startY==0)||(startY==zoneGeo.colonnes-1&&yPos==0)) {
					//startX=0 et startY=0 ou startY=colonnes-1 et lignes paires
					//--> finX=lignes-1 et finY=l'opposé de startY
					return true;
			}
		}
		else if (startX==zoneGeo.lignes-1 && xPos==0) {
			if (lignesPaires) {
				if (yPos==startY) {
					//startX=lignes-1 et startY=0 ou startY=colonnes-1 et lignes paires
					//--> finX=0 et finY=startY
					return true ;
				}
			}
			else //si lignes impaires
				if ((yPos==zoneGeo.colonnes-1&&startY==0)||(startY==zoneGeo.colonnes-1&&yPos==0)) {
					//startX=lignes-1 et startY=0 ou startY=colonnes-1 et lignes paires
					//--> finX=lignes-1 et finY=l'opposé de startY
					return true;
			}
		}
		return false ;//si tous les tests faux
	}
	
}
