package objetos;

public class Carro {

	
	public String modelo;
	public String cor;
	public int chasi;
	public boolean motor;
	public int caixaSom;
	public boolean portaMala;
	public int rodas;
	public boolean ligado;
	public int velocidade;
	
	
	public void ligarCarro() {
		ligado=true;
		System.out.println("Carro ligando...");
	}
	public void desligarCarro() {
		if(velocidade==0) {
		ligado=false;
		System.out.println("Carro desligando...");
	    }else {
	    	System.out.println("Desacelere o carro.,0");
	    }
	}
	
}


