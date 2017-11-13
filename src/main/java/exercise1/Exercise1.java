package exercise1;

public class Exercise1 {
	static Person createPerson(String name, int age) {
		// Ajoutez les champs name et age à la classe Person.
		// Créez un constructeur public permettant d'initialiser ces valeurs au moment de la construction.
		// Créez des getters publics pour lire ces valeurs une fois la classe construite.
		return new Person(name,age);
		//return null;
		// return une instance de la classe
	}

	public static void main(String[] args) {     // équivalent du void main()
		// Considérant que cette classe est démarrée en ligne de commande avec un premier paramètre donnant le nom
		// et un second donnant l'âge (nombre entier), créez un objet Person sur base de ceux-ci.
		// Ecrivez ensuite le nom et l'âge de cette personne sur la sortie standard.
		String name=args[0];
		int age = Integer.parseInt(args[1]); //.parseint permet de convertir un élément(string) en un entier

		Person person= new Person (name, age);

		System.out.println("Person: "+ person.getName() + ", " + person.getAge()); //affichage du nom et de l'âge

	}
}
