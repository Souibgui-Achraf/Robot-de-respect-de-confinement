package monProjet;

import java.awt.EventQueue;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class dialogue {

	public static JFrame frame;
	JLabel lb;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dialogue window = new dialogue();
					dialogue.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public dialogue() {
		initialize();
	}
	
	public void seticon(String s) {
		if (s.equals("")) lb.setIcon(null);
		else {
			s+=".png";
			lb.setIcon(new ImageIcon(dialogue.class.getResource("/"+s)));
		}
	}


	private void initialize() {
		int w=300;
		int h=259;
		frame = new JFrame();
		frame.setSize(320,282);
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
	    Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
	    frame.setLocation((int) rect.getMaxX() -320, 0);
	//	frame.setBounds(100, 100, 320, 282);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		dialogue.frame.setVisible(true);
		
		lb = new JLabel();
		lb.setBounds(10, 10, w, h);
		frame.getContentPane().add(lb);
		
		JLabel b = new JLabel();
		b.setBounds(0, 0,320,282);
		b.setIcon(new ImageIcon(dialogue.class.getResource("/back.jpg")));
		frame.getContentPane().add(b);
	}

}
