package programa;

import java.util.Scanner;

import objetos.Cliente;



public class CadCliente {
	
	
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		
		Cliente cliente1= new Cliente("Carlos" ,'m',20);
		
		cliente1.classeSocial="pobre";
		cliente1.email= "fulano@pipipipopopo.com.br";
		cliente1.estadoCivil= "solteiro";
		cliente1.nacionalidade= "BR";
		
		cliente1.experimentar();
		cliente1.comprar();
		cliente1.irEmbora();
		
		
		
		
	}	

}
