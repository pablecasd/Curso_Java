
public class Constructor {

	public static void main (String[] args){
		//Definicion de un objeto sin constructor
		//Contacto c1 = new Contacto() ;
		//c1.nombre="Pablo";
		//c1.telf=650877723;
		//c1.imprimir();
		
		//Definicion de un objeto con constructor
		Contacto c2 = new Contacto("Jose", 654998732);		
		c2.imprimir(); //Edad por defecto 0
		
		Contacto c3 = new Contacto("Paco", 670098321, 25);
		c3.imprimir(); //Definimos segundo constructor que pasa 3 argumentos en vez de 2
		
		
	}
}
