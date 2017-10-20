package exercise2;

class Person {
	private static int populationsize;
	private static long totalage = 0;
	private int age;

	public Person(int age){

		this.age=age;
		populationsize++;
		totalage += age;

	}

	public static int getPopulationSize()  {

		return populationsize;
	}

	public static float computePopulationAverage(){

		return ((float)totalAge)/populationsize;
	}

	public static void resetPopulation(){

		populationsize=0;
	}
}
