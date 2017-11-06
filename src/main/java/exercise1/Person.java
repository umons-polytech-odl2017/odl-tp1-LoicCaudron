package exercise1;

class Person {

	private int age;
	private String name;

	public int getAge(){

		return age;
	}

	public String getName(){
		return name;
	}

	public Person(String name, int age){

		this.age=age;
		this.name=name;
	}
}
