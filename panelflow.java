import java.awt.*;
import javax.swing.*;
public class panelflow extends JPanel {

	panelflow() {
	setBackground(Color.green);
	setLayout(new FlowLayout()); //Dentro del layout principal cada panel puede tener un layout distinto
	add(new JButton("B1"));
	add(new JButton("B2"));
	add(new JButton("B3"));
	add(new JButton("B4"));
	}
	
	

	
	

	
}
