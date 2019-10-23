package exercise2;

class Person {
	private int Age;
	private static int totalAge=0;
	private static int populationSize=0;

	//constructeur person(age, totalAgePopulation et populationSize
	public Person(int Age){
		this.Age=Age;
		totalAge+=this.Age;
		populationSize++;
	}
	//get populationSize
	public static int computePopulationSize(){
		return populationSize;
	}
	//get average PopulationAge
	public static float computeAveragePopulationAge(){
		return totalAge/populationSize;
	}
	//reset totalAge && populationSize
	public static void resetPopulation(){
		totalAge=0;
		populationSize=0;
	}
}
