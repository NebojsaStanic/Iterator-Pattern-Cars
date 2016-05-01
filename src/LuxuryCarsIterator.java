import java.util.ArrayList;

public class LuxuryCarsIterator implements Iterator{
	
	ArrayList<Car> cars;
	int index;
	
	public LuxuryCarsIterator(ArrayList<Car> cars) {
		this.cars = cars;
	}

	@Override
	public boolean hasNext() {
		if(index>=cars.size()){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public Object next() {
		Car car = cars.get(index);
		index = index + 1;
		return car;
	}

}
