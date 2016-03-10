
import java.awt.*;
import javax.swing.*;


public class Gridlayout extends JFrame {
	
	
	Gridlayout() {
		setTitle("GRID LAYOUT");
		setBounds(0, 0, 400, 400);
		setVisible(true);
		
		Container contentpane = getContentPane();
		//contentpane.setLayout(new GridLayout(3,1)); Layout tendra 3 filas y 1 columna
		contentpane.setLayout(new GridLayout(2,1)); //2 filas y una columna
		
		contentpane.add(new panelflow()); //Se crean dos paneles distintos
		contentpane.add(new panelgrid());
		
		
		
	}
	
	public static void main(String[] args) {
		
Gridlayout ventana = new Gridlayout() ;

	}

}
