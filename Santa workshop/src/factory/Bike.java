package factory;

public class Bike extends Toy {

	Bike() {
		super(ToyType.BIKE);
		getToy();
	}

	@Override
	protected void getToy() {
		System.out.println("*Джуджетата взимат колело от фабриката*");
	}

}
