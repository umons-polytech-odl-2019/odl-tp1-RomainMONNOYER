package exercise1;

import java.util.Scanner;

public class Exercise1 {


//fonction qui interface les tests unitaire avec les fonctions==> sert uniquement aux tests unitaires
	static Person createPerson(String name, int age) {
		// Ajoutez les champs name et age à la classe Person.
		// Créez un constructeur public permettant d'initialiser ces valeurs au moment de la construction.
		// Créez des getters publics pour lire ces valeurs une fois la classe construite.
		Person p= new Person(name,age);
		return p;
	}

	public static void main(String[] args) {
		// Considérant que cette classe est démarrée en ligne de commande avec un premier paramètre donnant le nom
		// et un second donnant l'âge (nombre entier), créez un objet Person sur base de ceux-ci.
		// Ecrivez ensuite le nom et l'âge de cette personne sur la sortie standard.
		Person p=new Person(args[0],Integer.parseInt(args[1]));//je comprend pas les arguments
		System.out.print(p.getName()+" "+p.getAge());
	}
}
