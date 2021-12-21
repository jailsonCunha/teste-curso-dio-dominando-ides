package model.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrar = new Scanner(System.in);
		
		double a,b;
		
		System.out.print("Primeiro valor: ");
		a = entrar.nextDouble();
		System.out.print("Segundo valor: ");
		b = entrar.nextDouble();
		
		double soma = soma(a, b);
		double subtracao = subtracao(a, b);
		double multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);
				
		System.out.println("---------------------------------------------------");
		
		System.out.println("Soma dos valores: " + soma);
		System.out.println("Subtração dos valores: " + subtracao);
		System.out.println("Multiplicação dos valores: " + multiplicacao);
		System.out.println("Divisão dos valores: " + divisao);

	}

	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtracao(double a, double b) {
		return a - b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}

}
