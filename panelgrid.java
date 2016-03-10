import java.awt.Color;
import java.awt.*;
import javax.swing.*;
public class panelgrid extends JPanel {
	
	panelgrid() {
	setBackground(Color.red);
	setLayout(new GridLayout(2,2)); //Dentro del layout principal cada panel puede tener un layout distinto
	add(new JButton("B1"));
	add(new JButton("B2"));
	add(new JButton("B3"));
	add(new JButton("B4"));
	}
}
