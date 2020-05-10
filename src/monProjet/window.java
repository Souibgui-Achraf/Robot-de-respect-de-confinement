package monProjet;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class window {

	public static JFrame frame;
	int w=86;
	int h=64;
	static JLabel[][] labels ;//conteneur des images
	
	public window(int i,int j) {
		initialize(i,j);
		window.frame.setVisible(true);
	}
	 public static void seticon(ImageIcon icon,int i,int j) {
		 window.labels[i][j].setIcon(icon);
	 }
 
	private void initialize(int lignes,int colonnes) {
		frame = new JFrame();
		frame.setResizable(false);
		
		
		frame.setSize(colonnes*w+7, lignes*h +40);
		//frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		labels=new JLabel[lignes][colonnes];//conteneur des images
		for(int i=0;i<zoneGeo.lignes;i++) {//jlabel tab
			
			for(int j=0;j<zoneGeo.colonnes;j++) {
				labels[i][j]=new JLabel();
				//window.labels[i][j].setIcon(new ImageIcon(window.class.getResource("/void.jpg")));
				
				labels[i][j].setBounds(j*w,i*h, w, w);
				frame.getContentPane().add(labels[i][j]);
		}
		}
	}
}
