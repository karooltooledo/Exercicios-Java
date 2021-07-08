package ExercicioHeranca;

public class TestaTodos {

	public static void main(String[] args) {
		
		 	Cat cat = new Cat();
	        Horse horse = new Horse();
	        Preguica preguica = new Preguica();
	        
	        cat.setNome("Floki");
	        cat.setIdade(3);
	        cat.setPelo("Sim");
	        cat.setEmitirSom("Miado");
	        cat.setDeveCorrer("Sim");
	        
	        horse.setNome("Pimp");
	        horse.setIdade(7);
	        horse.setPelo("Sim");
	        horse.setEmitirSom("Relincha");
	        horse.setDeveCorrer("Sim");
	        
	        preguica.setNome("Alice");
	        preguica.setIdade(5);
	        preguica.setPelo("Sim");
	        preguica.setEmitirSom("Sons de alta-frequência pelas narinas");
	        preguica.setSobeNasArvores("Sim");
	        
	        System.out.println("=====Dados Gato=====");
	        System.out.println("Nome: " + cat.getNome());
	        System.out.println("Idade: " + cat.getIdade());
	        System.out.println("Pelo: " + cat.getPelo());
	        System.out.println("Som: " + cat.getEmitirSom());
	        System.out.println("Corre: " + cat.getDeveCorrer());
	        
	        System.out.println("\n=====Dados Cavalo=====");
	        System.out.println("Nome: " + horse.getNome());
	        System.out.println("Idade: " + horse.getIdade());
	        System.out.println("Pelo: " + horse.getPelo());
	        System.out.println("Som: " + horse.getEmitirSom());
	        System.out.println("Corre: " + horse.getDeveCorrer());
	        
	        System.out.println("\n=====Dados Preguiça=====");
	        System.out.println("Nome: " + preguica.getNome());
	        System.out.println("Idade: " + preguica.getIdade());
	        System.out.println("Pelo: " + preguica.getPelo());
	        System.out.println("Som: " + preguica.getEmitirSom());
	        System.out.println("Escala Árvores: " + preguica.getSobeNasArvores());

	    }

	
}

