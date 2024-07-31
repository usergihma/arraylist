package lpaArrayList31;

import java.util.ArrayList;

public class Ex_5 {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		try {
			nomes.add("Alice");
			nomes.add("Bob");
			nomes.add("Charlie");

			System.out.println("Nome: " + nomes.get(8));
		}
		catch (Exception erro){
			System.out.println("Registre um valor do tipo 'escrita' e/ou digite uma posição compativel com o tamanho da lista");
		}

	}
}