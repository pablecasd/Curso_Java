
import java.awt.Container;//importa lo necesario para el tipo container

import javax.swing.*;//importa swing

public class  Myframe extends JFrame {

	
	Myframe(){ //Constructor
		setTitle("Primera ventana");//Fijamos titulo de la ventana
		setBounds(300,100,300,300); //Fijamos el tamaño
		Container contentpane = getContentPane();// Creamos el panel de contenido
		
		JLabel texto1 = new JLabel("HOLA MUNDO");//Creamos un texto
		contentpane.add(texto1);//Añadimos texto al panel de contenido
		
		
	}
}
