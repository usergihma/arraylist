package lpaArrayList31;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner ler = new Scanner(System.in);
		a=10;
		System.out.println("Digite um número : ");
		b = ler.nextInt();
		try {
			c = a/ b; 
			System.out.println("O valor de C é :" + c );
		}
		catch (Exception erro) {
			System.out.println("Não existe divisão por 0");
		}

	}

}
