
public class BudgetCars implements Cars {
	
	Car[] cars;
	static final int MAX_SIZE = 5;
	int numberOfCars = 0;
	
	public BudgetCars() {
		cars = new Car[MAX_SIZE];
		addCar("Renault",1000);
		addCar("Peugeot",2000);
		addCar("Citroen",3000);
	}

	public void addCar(String model, int price) {
		Car car = new Car(model, price);
		if(numberOfCars>=cars.length){
			System.out.println("Can't add more cars");
		}
		else{
			cars[numberOfCars]=car;
			numberOfCars = numberOfCars + 1;	
		}
	}
	
	public Iterator createIterator(){
		return new BudgetCarsIterator(cars);
	}

}
