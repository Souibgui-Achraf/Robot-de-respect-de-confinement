package monProjet;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class choose {

	public static JFrame frame;
	static JLabel lb ;
	static boolean start=false;


	public choose() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(246, 190, 133));
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 483, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.setVisible(true);
		
		JLabel lb = new JLabel();
		lb.setBounds(204, 115, 250, 267);
		frame.getContentPane().add(lb);
		lb.setIcon(new ImageIcon(window.class.getResource("/nb1.png")));
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(26, 163, 150, 219);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(window.class.getResource("/exemple.png")));
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(26, 115, 150, 34);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(window.class.getResource("/exemple.jpg")));
		
		lb = new JLabel();
		lb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				start=true;
			}
		});
		lb.setBounds(115, 22, 247, 60);
		frame.getContentPane().add(lb);
		lb.setIcon(new ImageIcon(window.class.getResource("/button1.png")));
		
		
	}

}
