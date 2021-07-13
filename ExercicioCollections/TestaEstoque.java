package ExercicioCollections;

import java.util.ArrayList;

public class TestaEstoque {

	public static void main(String[] args) {

		Estoque b1 = new Estoque("Blusas", 20);
		Estoque c1 = new Estoque("Calças", 10);
		Estoque b2 = new Estoque("Bermudas", 25);
		Estoque j1 = new Estoque("Jaquetas", 12);
		
		ArrayList<Estoque> roupas = new ArrayList<>();
		
		roupas.add(b1);
		roupas.add(c1);
		roupas.add(b2);
		roupas.add(j1);
		
		System.out.println(roupas);
		System.out.println("======================");
		
		roupas.remove(2);
		System.out.println(roupas);
		
		System.out.println("======================");
		for(int i = 0; i < roupas.size(); i++) {
			System.out.println(roupas.get(i));
			
		}
	}
}
