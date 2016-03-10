
public class claseprivada {
	
	private String cadena= "cadena privada";
	private int numero = 15;
	
	private void metodo1(){
		System.out.println("Metodo privado");
	}
	
	public void setcadena(String cad) {
	cadena = cad;
}

public String getcadena() {
	return cadena;
}
}
