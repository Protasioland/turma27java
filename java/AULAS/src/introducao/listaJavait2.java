package introducao;

import java.util.Scanner;

public class listaJavait2 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
	
	int a,b,c;
	
	System.out.println("Leia a: ");
	a =leia.nextInt();
	System.out.println("Leia b: ");
	b =leia.nextInt();
	System.out.println("Leia c: ");
	c =leia.nextInt();
	
	if (a == b && b == c) {
		System.out.printf(" %d >  %d  > %d",a,b,c);
	}
	
	else if (a > b && b > c) {
		System.out.printf(" %d  >   %d >   %d",c,b,a);
	
	}
	}
}


