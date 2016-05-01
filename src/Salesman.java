
public class Salesman {
	
	Cars budgetCars;
	Cars luxuryCars;
	
	public Salesman(Cars budgetCars, Cars luxuryCars) {
		this.budgetCars = budgetCars;
		this.luxuryCars = luxuryCars;
	}
	
	private void printCars(Iterator iterator){
		while(iterator.hasNext()){
			Car car = (Car) iterator.next();
			System.out.print(car.model + " model");
			System.out.println(" has price " + car.price + "$");
		}
	}
	
	public void printCars(){
		Iterator budgetCarsIterator = budgetCars.createIterator();
		Iterator luxuryCarsIterator = luxuryCars.createIterator();
		System.out.println("Budget cars are:\n");
		printCars(budgetCarsIterator);
		System.out.println("\nLuxury cars are:\n");
		printCars(luxuryCarsIterator);
	}

}
