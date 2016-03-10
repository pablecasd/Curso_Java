
public class Clases_objetos {
	

		public static void main(String[] args){
			
			Coche bmw = new Coche(); //Definimos nuevo objeto
			bmw.color = "Negro"; //Damos valor a color del objeto
			bmw.modelo = "320d"; //Damos valor a modelo del objeto
			
			System.out.println("Color: "+bmw.color +"\nModelo: " +bmw.modelo);
			//Imprimimos color y modelo del objeto
			
			
			bmw.arrancar_motor();
			//Llamamos a metodos del objeto
			bmw.apagar_motor(); 
			
		}
	

}
