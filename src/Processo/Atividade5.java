package Processo;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Escreva uma palavra: ");
        String caracter = sc.nextLine();
        String invertida = "";
        
        for (int i = caracter.length() - 1; i >= 0; i--) {
            invertida += caracter.charAt(i);
        }
        System.out.println("String original: " + caracter);
        System.out.println("String invertida: " + invertida);
        
        sc.close();
	}

}
