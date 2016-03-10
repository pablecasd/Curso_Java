import javax.swing.*;
import java.awt.*;

public class Eventos extends JFrame {
	
	Eventos() {
		setTitle("Eventos");
		setBounds(200,200,200,200);
		setVisible(true);
		setLayout(new FlowLayout());
	mybutton boton1 = new mybutton();//Creamos el botón
	boton1.addActionListener(boton1);//IMPORTANTE Entre paréntesis quien 'escucha' el botón, en este caso
	//El mismo botón es el que 'escucha' pero podría ser otro objeto u otra clase
	add(boton1); //Añadimos el boton
	}

	
	public static void main(String[] args) {
		Eventos ventana = new Eventos();
		

	}

}
