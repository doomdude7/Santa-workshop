package command;

public class NeedBikesCommand implements ICommand {
	
 ToyBike bike;
 
	public NeedBikesCommand(ToyBike bike) {
		super();
		this.bike = bike;
	}

	@Override
	public void execute() {
		System.out.println("Дядо Коледа: Трябват ми колелета!");
		bike.writeBike();
	}

}
