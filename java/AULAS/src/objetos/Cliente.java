package objetos;

public class Cliente {
   
	
	
	  public String nome; //atributo do objeto Pessoa
	  public char genero; 
	  public int idade; 
	  public String classeSocial;
	  public String nacionalidade;
	  public String email;
	  public String estadoCivil;
	  
	  
	  
	  public String getCadastroCliente() {
		 String  CadastroCliente= "nome"+"genero"+"idade"+"classeSocial"+"nacionalidade";
		 return CadastroCliente;
	  }
}
