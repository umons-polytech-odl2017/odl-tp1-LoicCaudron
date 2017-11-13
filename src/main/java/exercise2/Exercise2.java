package exercise2;

public class Exercise2 {

	// Ajoutez un champ age à chaque instance de la classe Person.
	// Créez-y une méthode statique "computePopulationSize" pour retourner la taille de la population.
	// Créez-y une méthode statique "computeAveragePopulationAge" pour calculer l'âge moyen de la population.
	// Implémentez-y une méthode statique "resetPopulation" pour remettre les compteurs à zéro.

	static Person createPerson(int age) {

		return new Person(age);
	}

	static int computePopulationSize() {             //calcul de la taille de la population
		// TODO remove comment when implemented
		// return Person.computePopulationSize();
		return  Person.getPopulationSize();
	}

	static float computeAveragePopulationAge() {    //calcul de l'âge moyen en appelant la fonction computePopulationAverage de la classe Person
		// TODO remove comment when implemented
		// return Person.computeAveragePopulationAge();
		return Person.computePopulationAverage();
	}

	static void resetPopulation() {
		// TODO remove comment when implemented
		 Person.resetPopulation();
	}

	// bien fini
}
