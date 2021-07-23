package entidades;

public class ContaEstudante extends Contag6 {
	import java.util.Scanner;




		private double limiteEstudantil = 5000.0;
		private char opcaoLetra;
		private
		Scanner leia = new Scanner(System.in);
		

		public ContaEstudantil(int numero, String nomeCliente, double limiteEstudantil) {
			super(numero, nomeCliente);
			this.limiteEstudantil = limiteEstudantil;
		}

		public double getLimiteEstudantil() {
			return limiteEstudantil;
		}

		//public void setLimiteEstudantil(double limiteEstudantil) {
			//this.limiteEstudantil = limiteEstudantil;
//		}
		public void usarLimiteEstudantil(double valor) {
			super.credito(valor);
			this.limiteEstudantil = limiteEstudantil - valor;
			
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public void menuEstudantil() {
			double valorEmprestimo = 0;
			String menuEstudantil[] = {"D�bito", "Cr�dito", "Saldo","Credito Estudantil", "Sair"};
			
			for(int x = 0; x<menuEstudantil.length; x++) {
				System.out.print((x+1) + " - " + menuEstudantil[x] + "\n");
			}
		
			System.out.println("Sabemos que a vida de estudante pode n�o ser facil!/n");
			System.out.println("Por isso estamos liberando um credito de R$:"+limiteEstudantil);
	        System.out.println("Gostaria de contratar o emprestimo? [S/N] ");
	        opcaoLetra = leia.next().toUpperCase().charAt(0);
	        
	        if (valorEmprestimo == 's') {
	        	System.out.println("Qual valor voc� deseja?");
	        	valorEmprestimo= leia.nextDouble();
	        	if (valorEmprestimo <=0 && valorEmprestimo>limiteEstudantil) {
	        		System.out.println("Valor solicitado invalido!");
	        	}
	             else {
	        	System.out.println("Saldo atual de:"+saldo);//FAZER OVERRIDE NESSE SALDO
	        }
	     }
	        	else {
	        		System.out.println("");
		
	        	}
		} 
	}

