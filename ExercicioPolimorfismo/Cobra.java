package ExercicioPolimorfismo;

public class Cobra implements Animal{

	@Override
	public void nome() {
		System.out.println("Nome Cobra: Pitica");
		
	}

	@Override
	public void idade() {
		System.out.println("Idade: 12 anos");
		
	}

	@Override
	public void som() {
		System.out.println("Som da Cobra: Chocalho");
	}
	
}
