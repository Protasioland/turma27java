package introducao;

public class Temperatura {

	
	public static void main (String [] args) {
		
		double temperatura = 36;
		String name = "Ed";
		
		System.out.println("Olá "+ name);
		System.out.println("Em Kelvin: " + (temperatura+ 273.15)+" K");
		temperatura = (temperatura*1.8)+32;
		System.out.println("Em Fahrenheit: "+ temperatura+ " F" );
	}
}
