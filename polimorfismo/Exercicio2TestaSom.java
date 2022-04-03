package br.com.generation.polimorfismo;

public class Exercicio2TestaSom {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica preg = new Preguica();

		dog.setNome("Mac");
		dog.setIdade(2);
		
		horse.setNome("Spartan");
		horse.setIdade(6);
		
		preg.setNome("Soninho");
		preg.setIdade(3);
		
		System.out.println("\n"+dog.getNome()+" é um cachorro de "+dog.getIdade()+" anos ");
		dog.EmitirSom();
		dog.correr();
		
		System.out.println("\n"+preg.getNome()+" é um preguiça de "+preg.getIdade()+" anos ");
		preg.EmitirSom();
		preg.subirEmArvores();
		
		System.out.println("\n"+horse.getNome()+" é um cavalo de "+horse.getIdade()+" anos ");
		horse.EmitirSom();
		horse.correr();
		
		}
	}

