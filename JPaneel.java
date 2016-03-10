import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;


public class JPaneel extends JFrame {
	
	JPaneel() {
		setTitle("JPANEL");
		setBounds(0, 0, 400, 400);
		setVisible(true);
		
		Container contentpane = getContentPane();
		
		//FlowLayout layout1 = new FlowLayout() ;  No declaramos ningun layout 
		//contentpane.setLayout(layout1); Por defecto se declara BorderLayout

		//JPanel panel1 = new JPanel(); Asi declarariamos el panel en la misma clase
		//panel1.setBackground(Color.red); 
		MyPanel panel1 = new MyPanel(); //Llamamos al constructor y creamos un panel en otra clase
        contentpane.add(panel1); //Añadimos el panel
}
	
public static void main(String[] args){
	
	JPaneel ventana = new JPaneel();
	
}
	}
