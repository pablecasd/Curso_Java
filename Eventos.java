import javax.swing.*;
import java.awt.*;

public class Eventos extends JFrame {
	
	Eventos() {
		setTitle("Eventos");
		setBounds(200,200,200,200);
		setVisible(true);
		setLayout(new FlowLayout());
	mybutton boton1 = new mybutton();//Creamos el bot�n
	boton1.addActionListener(boton1);//IMPORTANTE Entre par�ntesis quien 'escucha' el bot�n, en este caso
	//El mismo bot�n es el que 'escucha' pero podr�a ser otro objeto u otra clase
	add(boton1); //A�adimos el boton
	}

	
	public static void main(String[] args) {
		Eventos ventana = new Eventos();
		

	}

}
