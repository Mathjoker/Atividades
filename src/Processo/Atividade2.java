package Processo;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		int num1 = 0;
        int num2 = 1;
        int soma = 0;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Informe o número:");
        int numero = sc.nextInt();
        
        while (soma < numero) {
            soma = num1 + num2;
            num1 = num2;
            num2 = soma;
        }
        
        if (soma == numero) {
            System.out.println("O número informado pertence a sequência de Fibonacci!");
        } else {
            System.out.println("O número informado não pertence a sequência de Fibonacci!");
        }
        
        sc.close();
	}

}
