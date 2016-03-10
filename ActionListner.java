import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListner extends JFrame implements ActionListener
 {
	
	JLabel texto, texto2; //Atributo se puede variar
	ActionListner() {
		setTitle("Action Listner");
		setBounds(200,200,200,200);
		setBackground(Color.BLACK);
		setVisible(true);
	
		setLayout(new FlowLayout());
	    texto = new JLabel("Haz click en el boton") ;
	    add(texto);
	    JButton boton1= new JButton("Click me");
	    boton1.addActionListener(this);
	    add(boton1);
	    
	    texto2 = new JLabel("Cambiar fondo");
	    add(texto2);
	    JButton boton2 = new JButton (new ImageIcon("social.png")); //Insertar imagen en botón
	    boton2.setBackground(Color.WHITE);
	    boton2.setBorderPainted(false);
	    
	    add(boton2);
	    
	    paintComponents(getGraphics());
	    
	    
	}

	
	public static void main(String[] args) {
		ActionListner ventana = new ActionListner();
	}


	public void actionPerformed(ActionEvent event) {
	
		System.out.println("Buen Click!"); 
		texto.setText("Se ha clickeado correctamente"); //Variamos el contenido de la variable texto
		
		
	}
		

}
