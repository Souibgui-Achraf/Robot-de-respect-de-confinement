package monProjet;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class dialogue {

	public static JFrame frame;
	private JLabel lb;//conteneur des images du dialogue
	
	public void seticon(String s) {//pour modifier l image du Jlabel (dialogue)
		if (s.equals("")) lb.setIcon(null);
		else {
			s+=".png";
			lb.setIcon(new ImageIcon(dialogue.class.getResource("/"+s)));
		}
	}


	public dialogue() {
		int w=300;
		int h=259;
		frame = new JFrame();
		frame.setSize(320,282);
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
	    Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
	    frame.setLocation((int) rect.getMaxX() -320, 0);//top left
		
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		dialogue.frame.setVisible(true);
		
		lb = new JLabel();//pour l image du dialogue
		lb.setBounds(10, 10, w, h);
		frame.getContentPane().add(lb);
		
		JLabel b = new JLabel();//pour l image de background
		b.setBounds(0, 0,320,282);
		b.setIcon(new ImageIcon(dialogue.class.getResource("/background2.jpg")));
		frame.getContentPane().add(b);
	}

}
