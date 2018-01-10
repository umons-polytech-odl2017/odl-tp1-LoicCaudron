package exercise1;

class Person {

	private int age;
	private String name;


	public Person(String name, int age){ // initialisation du nom et de l'âge

		this.age=age;
		this.name=name;
	}
	public int getAge(){

		return age;
	}

	public String getName(){

		return name;
	}
}
