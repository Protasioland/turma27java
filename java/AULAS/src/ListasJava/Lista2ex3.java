package ListasJava;
import  java.util.Scanner ;


public class Lista2ex3 {
	
	public  static  void  main ( String [] args ) {
		Scanner leia= new Scanner(System.in);
		
		int idade;
		
		System.out.println ( " Qual a idade do aluno? " );
		idade = leia . nextInt ();
		
		if (idade >= 10  && idade <= 14 ) {
			System.out.println ( " O aluno deve ser matriculado na turma infantil. " );
		} else  if (idade >= 15  && idade <= 17 ) {
			System.out.println ( " O aluno deve ser matriculado na turma juvenil. " );
		} else  if (idade < 10 ) {
			System.out.println( " O aluno não tem idade para ser matriculado. " );
		} else {
			System.out.println ( " O aluno deve ser matriculado na turma adulto. " );
		}
		
		

	}

}


