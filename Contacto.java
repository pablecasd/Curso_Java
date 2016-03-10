
public class Contacto {
//Atributos
	String nombre = "Desconocido" ; //Definimos valores por defecto
	long telf = 000000000;
	int edad = 00;
	//Metodos
	Contacto(String cadena, long numero){ //Metodo--> Constructor
		//OBLIGATORIO QUE SE LLAME IGUAL QUE LA CLASE
		//ESTE CONSTRUCTOR SE USARA CUANDO SE MANDEN 2 PARAMETROS DESDE MAIN
		nombre=cadena;
		telf=numero;
	}
	
	Contacto(String cadena, long numero, int ed) { //SE PUEDE DEFINIR UN SEGUNDO CONSTRUCTOR
		//ESTE NUEVO CONSTRUCTOR SE USARA CUANDO SE MANDEN 3 PARAMETROS DESDE MAIN
		//SIGUE SIENDO OBLIGATORIO QUE SE LLAME IGUAL QUE LA CLASE
	nombre=cadena;
	telf=numero;
	edad=ed;
	}
	void imprimir() { //Metodo que imprime el contacto
		System.out.println(nombre + " Telefono: "+telf);
		System.out.println("Edad: "+edad + "\n");
	}
}
