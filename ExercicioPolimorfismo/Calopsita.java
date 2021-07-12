package ExercicioPolimorfismo;

public class Calopsita implements Animal{

	@Override
	public void nome() {
		System.out.println("Nome Calopsita: Nina");
		
	}

	@Override
	public void idade() {
		System.out.println("Idade: 9 anos");
		
	}

	@Override
	public void som() {
		System.out.println("Som da Calopsita: Canto\n");
		
	}
	
	

}
