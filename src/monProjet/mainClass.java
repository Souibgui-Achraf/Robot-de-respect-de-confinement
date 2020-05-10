package monProjet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JFileChooser;

public class mainClass {
	
	public static window w;

	public static void main(String[] args) throws IOException {
		int lignes;//matrice
		int colonnes;//matrice
		int startX;//pour robot
		int startY;//pour robot
		choose ch=new choose();
		
		zoneGeo zone=new zoneGeo();
		while(!choose.start) {
			sleep(200);
		};
		choose.frame.dispose();
		JFileChooser chooser = new JFileChooser();
		FileReader in = null;
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		{
		File selectedFile = chooser.getSelectedFile();
		in = new FileReader(selectedFile);
		}
		BufferedReader br = new BufferedReader(in);
	
		String ligne;//pour lire ligne par ligne
		
		int ligne_en_cours=0;
		
		while((ligne=br.readLine())!=null){//file still containes other lines
			ligne_en_cours++;
			String str[] =ligne.split(";"); 
			
			if (ligne_en_cours==1) {//1ere ligne on initialise lignes et colonnes du zone goe
				lignes =Integer.parseInt(str[0]); //cast string to int
				colonnes =Integer.parseInt(str[1]);
				zone.create(lignes	, colonnes);
			}
			else if(ligne_en_cours==2) {//2ere ligne on initialise pos depart du robot
				startX =Integer.parseInt(str[0]);//cast string to int
				startY =Integer.parseInt(str[1]);
				robot robot=new robot(startX-1,startY-1);
			} 
			else {//reste des lignes on initialise les pos des objets
				
				int x =Integer.parseInt(str[1]); //pos obj (ligne)
				int y =Integer.parseInt(str[2]); //pos obj (colonne)
				
				if ( str[0].toLowerCase().equals("personne" )) {
					boolean motif = Boolean.parseBoolean(str[3]);//cast string to bool (motif)
					personne p=new personne(x-1,y-1,motif);//creation d'une ins personne
					zone.add(p); //on l'ajoute a la zone geo(personne)
				}if (str[0].toLowerCase().equals("voiture")) {
					boolean motif = Boolean.parseBoolean(str[3]);
					voiture v=new voiture(x-1,y-1,motif);//x-1 et y-1 ( matrice 0-->n-1,0-->m-1 )
					zone.add(v);//on l'ajoute a la zone geo(voiture)
					
				}
				if (str[0].toLowerCase().equals("animal")) {
					animal a=new animal(x-1,y-1);
					zone.add(a);//on l'ajoute a la zone geo(animal)
				}
			}
			}
		
		window w=new window(zoneGeo.lignes,zoneGeo.colonnes);
		
		zone.show();//afficher la zone geo
		sleep(2000);
		startb button=new startb();
		while(!startb.selected) {
			sleep(200);
		}
		startb.frame.dispose();
		robot.parcours();
		
		if(robot.fin) {
			sleep(1000);
			resultat r=new resultat();
		}
	}
	
	
	static void sleep(int x) {//timer sleeps for x ms
		try {
		    TimeUnit.MILLISECONDS.sleep(x);
		} catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		}
	}
	}