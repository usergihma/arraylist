package lpaArrayList31;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
			int soma=0, i=0;
			
			while(i>5) {
				System.out.println("Informe o número a ser somado");
				numeros.add(ler.nextInt());
				i++;
			}
			for  (int n : numeros) {
				soma = soma + n;
				
			}

			System.out.println("Resultado da soma: " + soma);

		}

}