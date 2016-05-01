
public class BudgetCarsIterator implements Iterator{
	
	Car[] cars;
	int position;
	
	public BudgetCarsIterator(Car[] cars) {
		this.cars = cars;
	}

	@Override
	public boolean hasNext() {
		if(position>=cars.length||cars[position]==null){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public Object next() {
		Car car = cars[position];
		position = position +1;
		return car;
	}

}
