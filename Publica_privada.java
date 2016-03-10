
public class Publica_privada {

	public static void main(String[] args){
		clasepublica c1 = new clasepublica(); //creo un objeto de clase publica
		claseprivada c2 = new claseprivada(); //creo un objeto de clase privada
		
		System.out.println(c1.cadena);
		System.out.println(c1.numero);
		c1.cadena="Cambio de cadena"; //Cambiar cadena en clase publica
		//System.out.println(c2.cadena); Nos da error pues no podemos acceder a clase variables de clase privada
		//c2.numero=3 No cambiaria el valor de numero
		//c2.cadena="Cambio de cadena" no cambia el valor de la cadena, para ello debemos
		//Usar metodos publicos presentes en clase privada como por ejemplo:
		c2.setcadena("Cambio de cadena privada"); //Este metodo pasa una cadena a claseprivada
		System.out.println(c2.getcadena()); //Este metodo devuelve la cadena pasada previamente
		
		
		
	}
}
