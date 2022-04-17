package factory;

public class ToyFactory {

		public static Toy takeToy(ToyType type) {
			Toy toy = null;
			switch (type) {
			case BIKE:
				toy = new Bike();
				break;
			case DOLL:
				toy = new Doll();
				break;
			default: 
			System.out.println("Няма такава играчка");
			break;	
			}
			return toy;
		}
	}


