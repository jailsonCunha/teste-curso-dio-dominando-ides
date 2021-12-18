package model;

import model.gato.Gato;
import model.livro.Livro;

public class primeiroProgramaJava {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livro livro = new Livro();

		int a = 2;
		int b = 3;

		System.out.println("Olá Mundo! " + (a + b));
		
		System.out.println(gato);
		System.out.println(livro);
		

	}

}
