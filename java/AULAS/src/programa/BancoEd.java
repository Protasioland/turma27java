package programa;

import java.util.Scanner;

import objetos.ContaEd;

public class BancoEd {

	
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		ContaEd cliente1 = new ContaEd(1);
		ContaEd clinetevip= new ContaEd(1000,55.55);
		ContaEd clienteEspecial = new ContaEd(3);
		ContaEd clienteJaque = new ContaEd(123456);
		
		clienteEspecial.imprimeExtrato();
		clienteJaque.saca(1000.33);
		clienteJaque.imprimeExtrato();
		
	}
}
