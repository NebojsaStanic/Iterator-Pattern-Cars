
public class IteratorPatternCarsDemo {

	public static void main(String[] args) {
		Cars budgetCars = new BudgetCars();
		Cars luxuryCars = new LuxuryCars();
		
		Salesman salesman = new Salesman(budgetCars, luxuryCars);
		
		salesman.printCars();

	}

}
