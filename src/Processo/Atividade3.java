package Processo;

import java.util.ArrayList;
import java.util.List;

public class Atividade3 {

	public static void main(String[] args) {
		System.out.println("Exercicio Número 3");
        System.out.println("Letra A)");
        int a = 1;
        
        do{
            a += 2;
            System.out.print(a + ", ");
        }while(a != 9);
        System.out.println();
        
        
        System.out.println("\nLetra B)");
        int b = 2;
        
        do{
            b += b;
            System.out.print (b + ", ");
        }while(b != 128);
        System.out.println();
        
        
        System.out.println("\nLetra C)");
        int c = 0;
        int acrecimo = 1;
        do{
            c = c + acrecimo;
            acrecimo += 2;
            System.out.print (c + ", ");
        }while(c != 49);
        System.out.println();
        
        
        System.out.println("\nLetra D)");
        int d = 4;
        int adcional = 12;
        System.out.print (d + ", ");
        do{
            d += adcional;
            adcional += 8;
            System.out.print (d + ", ");
        }while(d != 100);
        System.out.println();
        
        
        System.out.println("\nLetra E)");
        int e = 1;
        int soma = 1;
        
        System.out.print (soma + ", ");
        for(int i = 0; i <5; i++){
            soma = soma + e;
            e = soma - e;
            System.out.print (soma + ", ");
        }
        System.out.println();
        
        System.out.println("\nLetra D)");
        List<Numeros> list = new ArrayList<>();
        Numeros num;
        num = new Numeros("um", 1);
        list.add(num);
        num = new Numeros("Dois", 2);
        list.add(num);
        num = new Numeros("Três", 3);
        list.add(num);
        num = new Numeros("Quatro", 4);
        list.add(num);
        num = new Numeros("Cinco", 5);
        list.add(num);
        num = new Numeros("Seis", 6);
        list.add(num);
        num = new Numeros("Sete", 7);
        list.add(num);
        num = new Numeros("Oito", 8);
        list.add(num);
        num = new Numeros("Nove", 9);
        list.add(num);
        num = new Numeros("Dez", 10);
        list.add(num);
        num = new Numeros("Onze", 11);
        list.add(num);
        num = new Numeros("Doze", 12);
        list.add(num);
        num = new Numeros("Treze", 13);
        list.add(num);
        num = new Numeros("Quatoze", 14);
        list.add(num);
        num = new Numeros("Quinze", 15);
        list.add(num);
        num = new Numeros("Dezesseis", 16);
        list.add(num);
        num = new Numeros("Dezessete", 17);
        list.add(num);
        num = new Numeros("Dezoito", 18);
        list.add(num);
        num = new Numeros("Dezenove", 19);
        list.add(num);
        num = new Numeros("Vinte", 20);
        list.add(num);
        num = new Numeros("Cem", 100);
        list.add(num);
        num = new Numeros("Duzentos", 200);
        list.add(num);
        
        
        for(Numeros obj : list){
            if(obj.getNome().startsWith("D")){
                System.out.print(obj);
            }
            
        }
	}

}
