package monProjet;

public class affichage {
	public static void affiche() {
		System.out.println ("Projet Vérification du respect du confinement par un robot") ;
		System.out.println ("***\\ Structure du fichier/***");
		System.out.println ("*                           *");
		System.out.println ("* N;M                       *");
		System.out.println ("* X;Y                       *");
		System.out.println ("* instance;x;y;motif        *");
		System.out.println ("* instance;x;y;motif        *");
		System.out.println ("* .                         *");
		System.out.println ("* .                         *");
		System.out.println ("*                           *");
		System.out.println ("*****************************");
		System.out.println ("NB: - 1ere ligne les dimentions de la zone ");
		System.out.println ("N:lignes et M:colonnes");
		System.out.println ("    - 2eme ligne pour la position de depart du robot ");
		System.out.println ("X suivant les lignes et Y suivant les colonnes");
		System.out.println ("    - instance pour avoir comme valeur personne ");
		System.out.println ("ou voiture ou animal");
		System.out.println ("    - x ey y position suivant respectivement lignes");
		System.out.println ("et colonnes");
		System.out.println ("    -motif peut avoir comme valeur true ou false");
		System.out.println ("    -motif obligatoire sauf pour un animal");
		System.out.println ("    -un animal ne peut pas avoir un motif");
		return;
	}
}
