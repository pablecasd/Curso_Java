
public class Suma_resta {

//Atributos
	int x; 
	int y;
	
	//Metodos 
	int suma() { //Metodo que suma dos variables
		int sum=x+y;
		return sum;
	}
	int resta() { //Metodo que resta dos variables
		int rest=x-y;
		return rest;
	}
	
	void imprimir() {  //Metodo que imprime el punto
		System.out.println("x: "+x);
		System.out.println("y: "+y +"\n");
	}
	
}
