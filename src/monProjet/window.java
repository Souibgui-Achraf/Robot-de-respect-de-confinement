package monProjet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class window {

	public static JFrame frame;

	static JLabel[][] labels ;//conteneur des images
	
	 public static void seticon(ImageIcon icon,int i,int j) {
		 //modificatin de l image de conteneur (JLabel)
		 window.labels[i][j].setIcon(icon);
	 }
 
	 public window(int lignes,int colonnes) {
		int w=86;
		int h=64;
			
		frame = new JFrame();
		frame.setResizable(false);
		
		
		frame.setSize(colonnes*w+7, lignes*h +40);
		//frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		labels=new JLabel[lignes][colonnes];//conteneur des images
		for(int i=0;i<zoneGeo.lignes;i++) {//jlabel tab (initialisation)
			
			for(int j=0;j<zoneGeo.colonnes;j++) {
				labels[i][j]=new JLabel();
				labels[i][j].setBounds(j*w,i*h, w, w);
				frame.getContentPane().add(labels[i][j]);
		}
		}
	}
}
