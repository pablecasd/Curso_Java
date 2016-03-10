import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	MyPanel() {
		setBackground(Color.red);
		JLabel texto1 = new JLabel("Soy el panel 1");
		JButton boton1 = new JButton("Soy el boton 1");
		add(texto1);
		add(boton1);
	}
}
