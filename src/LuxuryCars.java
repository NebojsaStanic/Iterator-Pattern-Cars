import java.util.ArrayList;

public class LuxuryCars implements Cars{
	
	ArrayList<Car> cars;
	
	public LuxuryCars() {
		cars = new ArrayList<Car>();
		addCar("Mercerdes-Benz",10000);
		addCar("Audi",15000);
		addCar("BMW",20000);
	}

	public void addCar(String model, int price) {
		Car car = new Car(model, price);
		cars.add(car);
	}
	
	public Iterator createIterator(){
		return new LuxuryCarsIterator(cars);
	}

}
