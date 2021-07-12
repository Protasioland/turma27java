package objetos;

public class ContaEd {

	private int numero;
	private double saldo;
	private double limite;
	
	public ContaEd (int numero) {
		this.numero=numero;
	}
	public ContaEd (int numero,double saldo) {
		this.numero=numero;
		this.saldo=saldo;
	}
	public ContaEd(int numero, double saldo, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	//ENCAPSULAMENTO 
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
    public void saca(double valorSaque) {
		saldo= saldo- valorSaque;
		if(valorSaque>saldo) {
			System.out.println("Opção Invalida");
		}
		else {
			System.out.println("Saque realizado!");
		}
	}
	
	public void deposita(double valorDeposito) {
		saldo = saldo+ valorDeposito;
	}
	
	public void imprimeExtrato() {
		System.out.println("Conta"+numero+"saldo atual: R$ "+saldo);
	}
	
}
