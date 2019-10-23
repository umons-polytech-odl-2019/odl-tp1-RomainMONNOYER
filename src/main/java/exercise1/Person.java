package exercise1;

class Person {
	private String Name;
	private int Age;

	//constructeur person
	public Person(String nom, int monage) {
		Name = nom;
		Age = monage;
	}
	//fct get var
	public String getName(){
		return Name;
	}
	public int getAge(){
		return Age;
	}

	//fct pour reset var
	public void setName(String nom){
		Name=nom;
	}
	public void setAge(int monage){
		Age=monage;
	}
}
