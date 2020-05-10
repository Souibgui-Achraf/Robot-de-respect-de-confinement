package monProjet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;

public class resultat {

	private JFrame frame;

	public resultat() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		int p,v,a,pa,pn,va,vn;
		double pap,pnp,vap,vnp,tap,tnp;
		
		
		p=robot.p;v=robot.v;a=robot.a;
		pa=robot.pa;pn=robot.pn;va=robot.va;vn=robot.vn;
		if(p==0	) {pap=0.0;pnp=0.0;} else {
			double x=(double)pa/(double)p;
			pap=Math.round(x * 1000.0) / 10.0;
			x=(double)pn/(double)p;
			pnp=Math.round(x * 1000.0) / 10.0;};
		if(v==0	) {vap=0.0;vnp=0.0;} else {
			double x=(double)va/(double)v;
			vap=Math.round(x * 1000.0) / 10.0;
			x=(double)vn/(double)v;
			vnp=Math.round(x * 1000.0) / 10.0;}
		if(p+v==0) {tap=0;tnp=0;}else {
			double x=(double)(pa+va)/(double)(p+v);
			tap=Math.round(x * 1000.0) / 10.0;
			x=(double)(pn+vn)/(double)(p+v);
			tnp=Math.round(x * 1000.0) / 10.0;
		}
			
		frame = new JFrame();
		
		frame.getContentPane().setBackground(new Color(204, 207, 188));
		//frame.setBounds(100, 100, 450, 300);
		frame.setSize(623,299);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText(p+"");
		textPane_1.setForeground(new Color(66, 118, 149));
		textPane_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_1.setEditable(false);
		textPane_1.setBackground(new Color(197, 224, 179));
		textPane_1.setBounds(150, 97, 68, 28);
		frame.getContentPane().add(textPane_1);
		StyledDocument doc1 = textPane_1.getStyledDocument();
		SimpleAttributeSet center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText(pa+"");
		textPane_2.setForeground(new Color(66, 118, 149));
		textPane_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_2.setEditable(false);
		textPane_2.setBackground(new Color(197, 224, 179));
		textPane_2.setBounds(234, 97, 68, 28);
		frame.getContentPane().add(textPane_2);
		StyledDocument doc7 = textPane_2.getStyledDocument();
		SimpleAttributeSet center7 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center7, StyleConstants.ALIGN_CENTER);
		doc7.setParagraphAttributes(0, doc7.getLength(), center7, false);
		
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText(pap+"%");
		textPane_4.setForeground(new Color(66, 118, 149));
		textPane_4.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_4.setEditable(false);
		textPane_4.setBackground(new Color(197, 224, 179));
		textPane_4.setBounds(312, 97, 88, 28);
		frame.getContentPane().add(textPane_4);
		StyledDocument doc5 = textPane_4.getStyledDocument();
		SimpleAttributeSet center5 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center5, StyleConstants.ALIGN_CENTER);
		doc5.setParagraphAttributes(0, doc5.getLength(), center5, false);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText(pn+"");
		textPane_6.setForeground(new Color(66, 118, 149));
		textPane_6.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_6.setEditable(false);
		textPane_6.setBackground(new Color(197, 224, 179));
		textPane_6.setBounds(419, 97, 64, 28);
		frame.getContentPane().add(textPane_6);
		StyledDocument doc4 = textPane_6.getStyledDocument();
		SimpleAttributeSet center4 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center4, StyleConstants.ALIGN_CENTER);
		doc4.setParagraphAttributes(0, doc4.getLength(), center4, false);
		
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setText(pnp+"%");
		textPane_8.setForeground(new Color(66, 118, 149));
		textPane_8.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_8.setEditable(false);
		textPane_8.setBackground(new Color(197, 224, 179));
		textPane_8.setBounds(501, 97, 81, 28);
		frame.getContentPane().add(textPane_8);
		StyledDocument doc10 = textPane_8.getStyledDocument();
		SimpleAttributeSet center10 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center10, StyleConstants.ALIGN_CENTER);
		doc10.setParagraphAttributes(0, doc10.getLength(), center10, false);
		
		JTextPane textPane = new JTextPane();
		textPane.setText(v+"");
		textPane.setForeground(new Color(66, 118, 149));
		textPane.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane.setEditable(false);
		textPane.setBackground(new Color(197, 224, 179));
		textPane.setBounds(150, 144, 68, 28);
		frame.getContentPane().add(textPane);
		StyledDocument doc = textPane.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText(va+"");
		textPane_3.setForeground(new Color(66, 118, 149));
		textPane_3.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_3.setEditable(false);
		textPane_3.setBackground(new Color(197, 224, 179));
		textPane_3.setBounds(234, 144, 68, 28);
		frame.getContentPane().add(textPane_3);
		StyledDocument doc2 = textPane_3.getStyledDocument();
		SimpleAttributeSet center2 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center2, StyleConstants.ALIGN_CENTER);
		doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
		
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText(vap+"%");
		textPane_5.setForeground(new Color(66, 118, 149));
		textPane_5.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_5.setEditable(false);
		textPane_5.setBackground(new Color(197, 224, 179));
		textPane_5.setBounds(312, 144, 88, 28);
		frame.getContentPane().add(textPane_5);
		StyledDocument doc6 = textPane_5.getStyledDocument();
		SimpleAttributeSet center6 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center6, StyleConstants.ALIGN_CENTER);
		doc6.setParagraphAttributes(0, doc6.getLength(), center6, false);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText(vn+"");
		textPane_7.setForeground(new Color(66, 118, 149));
		textPane_7.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_7.setEditable(false);
		textPane_7.setBackground(new Color(197, 224, 179));
		textPane_7.setBounds(420, 144, 64, 28);
		frame.getContentPane().add(textPane_7);
		StyledDocument doc3 = textPane_7.getStyledDocument();
		SimpleAttributeSet center3 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center3, StyleConstants.ALIGN_CENTER);
		doc3.setParagraphAttributes(0, doc3.getLength(), center3, false);
		
	
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setText(vnp+"%");
		textPane_9.setForeground(new Color(66, 118, 149));
		textPane_9.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_9.setEditable(false);
		textPane_9.setBackground(new Color(197, 224, 179));
		textPane_9.setBounds(501, 144, 81, 28);
		frame.getContentPane().add(textPane_9);
		StyledDocument doc9 = textPane_9.getStyledDocument();
		SimpleAttributeSet center9 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center9, StyleConstants.ALIGN_CENTER);
		doc9.setParagraphAttributes(0, doc9.getLength(), center9, false);
	
		JTextPane txtpnAaee = new JTextPane();
		txtpnAaee.setForeground(new Color(66, 118, 149));
		txtpnAaee.setEditable(false);
		txtpnAaee.setFont(new Font("Arial Black", Font.BOLD, 18));
		txtpnAaee.setBackground(new Color(197, 224, 179));
		txtpnAaee.setText(a+"");
		txtpnAaee.setBounds(150, 238, 68, 28);
		frame.getContentPane().add(txtpnAaee);
		StyledDocument doc8 = txtpnAaee.getStyledDocument();
		SimpleAttributeSet center8 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center8, StyleConstants.ALIGN_CENTER);
		doc8.setParagraphAttributes(0, doc8.getLength(), center8, false);
		

		JTextPane textPane_10 = new JTextPane();
		textPane_10.setText(p+v+"");
		textPane_10.setForeground(new Color(66, 118, 149));
		textPane_10.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_10.setEditable(false);
		textPane_10.setBackground(new Color(197, 224, 179));
		textPane_10.setBounds(150, 190, 68, 28);
		frame.getContentPane().add(textPane_10);
		StyledDocument doc11 = textPane_10.getStyledDocument();
		SimpleAttributeSet center11 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center11, StyleConstants.ALIGN_CENTER);
		doc11.setParagraphAttributes(0, doc11.getLength(), center11, false);
		
		JTextPane textPane_11 = new JTextPane();
		textPane_11.setText(pa+va+"");
		textPane_11.setForeground(new Color(66, 118, 149));
		textPane_11.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_11.setEditable(false);
		textPane_11.setBackground(new Color(197, 224, 179));
		textPane_11.setBounds(234, 195, 68, 28);
		frame.getContentPane().add(textPane_11);
		StyledDocument doc12 = textPane_11.getStyledDocument();
		SimpleAttributeSet center12 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center12, StyleConstants.ALIGN_CENTER);
		doc12.setParagraphAttributes(0, doc12.getLength(), center12, false);
		
		JTextPane textPane_12 = new JTextPane();
		textPane_12.setText(tap+"%");
		textPane_12.setForeground(new Color(66, 118, 149));
		textPane_12.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_12.setEditable(false);
		textPane_12.setBackground(new Color(197, 224, 179));
		textPane_12.setBounds(312, 195, 88, 28);
		frame.getContentPane().add(textPane_12);
		StyledDocument doc13 = textPane_12.getStyledDocument();
		SimpleAttributeSet center13 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center13, StyleConstants.ALIGN_CENTER);
		doc13.setParagraphAttributes(0, doc13.getLength(), center13, false);
		
		JTextPane textPane_14 = new JTextPane();
		textPane_14.setText(pn+vn+"");
		textPane_14.setForeground(new Color(66, 118, 149));
		textPane_14.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_14.setEditable(false);
		textPane_14.setBackground(new Color(197, 224, 179));
		textPane_14.setBounds(419, 195, 64, 28);
		frame.getContentPane().add(textPane_14);
		StyledDocument doc14 = textPane_14.getStyledDocument();
		SimpleAttributeSet center14 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center14, StyleConstants.ALIGN_CENTER);
		doc14.setParagraphAttributes(0, doc14.getLength(), center14, false);
		
		JTextPane textPane_13 = new JTextPane();
		textPane_13.setText(tnp+"%");
		textPane_13.setForeground(new Color(66, 118, 149));
		textPane_13.setFont(new Font("Arial Black", Font.BOLD, 18));
		textPane_13.setEditable(false);
		textPane_13.setBackground(new Color(197, 224, 179));
		textPane_13.setBounds(501, 195, 81, 28);
		frame.getContentPane().add(textPane_13);
		StyledDocument doc15 = textPane_13.getStyledDocument();
		SimpleAttributeSet center15 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center15, StyleConstants.ALIGN_CENTER);
		doc15.setParagraphAttributes(0, doc15.getLength(), center15, false);
		
		
		
		
		JLabel lb = new JLabel("New label");
		lb.setBounds(25, 25, 571, 253);
		frame.getContentPane().add(lb);
		lb.setIcon(new ImageIcon(window.class.getResource("/table.png")));
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblNewLabel.setBounds(frame.getWidth()-25, 0, 25, 25);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(window.class.getResource("/x.jpg")));
		
	}
}
