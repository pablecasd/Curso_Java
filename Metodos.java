
public class Metodos {

	public static void main (String[] args) {
		
		int suma1;
		int resta1; //Definimos dos variables
		
		Suma_resta sr1 = new Suma_resta(); //Creamos nuevo objeto
		sr1.x=5;
		//Damos valor a las variables del objeto
		sr1.y=3;
		
		suma1=sr1.suma(); //Llamamos a metodos y guardamos resultados en nuestras variables
		resta1=sr1.resta();
		
		sr1.imprimir(); //Llamamos a metodo que imprime nuestros puntos 
		
		System.out.println("Suma: "+suma1); 
		//Imprimimos nuestras variables
		System.out.println("Resta: "+resta1);
		
	}
}
