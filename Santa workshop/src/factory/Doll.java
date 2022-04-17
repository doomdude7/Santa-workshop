package factory;

public class Doll extends Toy {

	Doll() {
		super(ToyType.DOLL);
		getToy();
	}

	@Override
	protected void getToy() {
		System.out.println("*Джуджетата взимат кукла от фабриката*");
	}

}
