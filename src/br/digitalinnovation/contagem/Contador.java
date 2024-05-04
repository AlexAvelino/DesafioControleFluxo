package br.digitalinnovation.contagem;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro par�metro");
		int parametroUm = scan.nextInt();
		System.out.println("Digite o segundo par�metro");
		int parametroDois = scan.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.err.println("O segundo par�metro deve ser maior que o primeiro");
		}
		scan.close();
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		for(int i = 0; i<contagem; i++) {
			System.out.println("Imprimindo o n�mero: " + (i+1));
		}
	}
}