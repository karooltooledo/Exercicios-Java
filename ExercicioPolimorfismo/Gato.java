package ExercicioPolimorfismo;

public class Gato implements Animal {

	@Override
	public void nome() {
		System.out.println("Nome Gato: Floki");
		
	}

	@Override
	public void idade() {
		System.out.println("Idade Gato: 1 ano");
		
	}

	@Override
	public void som() {
		System.out.println("Som do Gato: Miau\n");
		
	}

}
