package monProjet;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class startb {

	public static JFrame frame;
	public static boolean selected=false;//indique si le boutton start a ete selectionné
	

	 public startb() {
		frame = new JFrame();
		frame.setSize(204, 76);
		//frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		frame.setVisible(true);
		
		JLabel lb = new JLabel();//pour le boutton
		lb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				selected=true;
			}
		});
		lb.setBounds(0, 0, 204, 76);
		frame.getContentPane().add(lb);
		lb.setIcon(new ImageIcon(window.class.getResource("/start.png")));
	}

}
