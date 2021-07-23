package objetos;

public class Cliente {
   
	
	
	  public String nome; //atributo do objeto Pessoa
	  public char genero; 
	  public int idade; 
	  public String classeSocial;
	  public String nacionalidade;
	  public String email;
	  public String estadoCivil;


	public Cliente(String nome, char genero, int idade) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public char getGenero() {
		return genero;
	}



	public void setGenero(char genero) {
		this.genero = genero;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getClasseSocial() {
		return classeSocial;
	}



	public void setClasseSocial(String classeSocial) {
		this.classeSocial = classeSocial;
	}



	public String getNacionalidade() {
		return nacionalidade;
	}



	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getEstadoCivil() {
		return estadoCivil;
	}



	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	  
	  
	public void comprar () {
		System.out.println("Cliente realigou compra");
	}
	public void experimentar () {
		System.out.println("Experimentando a peça ...");
	}
	public void irEmbora () {
		System.out.println("Cliente foi embora");
	}
}


