import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class mybutton extends JButton implements ActionListener { //extends JButton e implementamos una interfaz

	mybutton() {//Constructor
		super("Click Me!");
	}
	
	public void actionPerformed(ActionEvent e) {
	System.out.println("Se ha clickeado en el botón");//Esto es lo que ocurre cuando pulsamos el botón
		JLabel texto1 = new JLabel("Buen Click!");
		add(texto1);

	}

}
