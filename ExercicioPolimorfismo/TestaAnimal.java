package ExercicioPolimorfismo;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Gato meuGato = new Gato();
		Calopsita minhaCalopsita = new Calopsita();
		Cobra minhaCobra = new Cobra();
		
		meuGato.nome();
		meuGato.idade();
		meuGato.som();
		
		minhaCalopsita.nome();
		minhaCalopsita.idade();
		minhaCalopsita.som();
		
		minhaCobra.nome();
		minhaCobra.idade();
		minhaCobra.som();

	}

}
