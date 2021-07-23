 package ExerciciosExtras;

public class CanetaGuanabara {
	
	public String modelo;
	public String cor;
	public float ponta;
	protected int carga;
	protected    boolean tampada;
	
	
	public void status() {
		System.out.println("Caneta da dor: "+this.cor);
		System.out.println("Caneta está tampada? "+this.tampada);
		System.out.println("Quando tamanho da ponta? "+this.ponta);
	}
	
	public void rabiscar() {
		if (this.tampada ==true) {
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	}
	protected void tampar() {
		this.tampada=true;
	}
	protected void destampar()  {
		this.tampada=false;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	
	
}
