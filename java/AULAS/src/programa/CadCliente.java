package programa;

import java.util.Scanner;

import objetos.Cliente;



public class CadCliente {
	
	
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		//Cliente cliente1= new Cliente("Carlos","homem","20 anos","pobre","brasoleiro");
		Cliente cliente1= new Cliente();
		
		System.out.println("Digite o nome: ");
		cliente1.nome=leia.next();
		System.out.println("Digite o sexo M/F/O/: ");
		cliente1.genero=leia.next().charAt(0);
		System.out.println("Digite sua idade: ");
		cliente1.idade=leia.nextInt();
		System.out.println("Digite sua classe social: ");
		cliente1.classeSocial=leia.next();	
		System.out.println("Digite sua nacionalidade: ");
		cliente1.nacionalidade=leia.next();
		System.out.println("Digite sue email: ");
		cliente1.email=leia.next();
		System.out.println("Digite seu estado civil: ");
		cliente1.estadoCivil=leia.next();
		
		//System.out.println("Clinte: %s,/nsexo:%c /n idade;%d /n classe social %s/n nacionalidade:%s/n email:%s/n/n estado civil: %S", nome, genero, idade, classeSocial, nacionalidade, email, estadoCivil);
		
	}	

}
