import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;

public class Frame_layout extends JFrame {

	Frame_layout() {
		setTitle("Prueba Layout");
		setBounds(0, 0, 400, 400);
		setVisible(true);
		
		Container contentpane = getContentPane();
		
		FlowLayout layout1 = new FlowLayout() ; //Declaramos un FlowLayout
		contentpane.setLayout(layout1);
		JLabel texto1 = new JLabel ("texto1111111111111111111111111111111111111111"); //Declaramos dos label
		JLabel texto2 = new JLabel ("texto222222222222222222222222222222222222");
		JButton boton1 = new JButton ("Boton 11111"); //Y un boton
		
		
		contentpane.add(texto1);//Añadimos los labels y el boton y comprobamos que lo pondrá por filas
		contentpane.add(texto2);
		contentpane.add(boton1);
	}
	
	
	public static void main(String[] args){
		
		
		Frame_layout vent = new Frame_layout();
	}
}
