package observer;

public class MagicalBoard {

	public void watchBoardBike() {
		Message message = new Message();
		Observer dwarf1 = new Dwarf("Първо джудже");
		Observer dwarf2 = new Dwarf("Второ джудже");
		Observer dwarf3 = new Dwarf("Трето джудже");
		
		message.subscribe(dwarf1);
		message.subscribe(dwarf2);
		message.subscribe(dwarf3);
		message.setMessage("колело");
	}
	public void watchBoardDoll() {
		Message message = new Message();
		Observer dwarf1 = new Dwarf("Първо джудже");
		Observer dwarf2 = new Dwarf("Второ джудже");
		Observer dwarf3 = new Dwarf("Трето джудже");
		
		message.subscribe(dwarf1);
		message.subscribe(dwarf2);
		message.subscribe(dwarf3);
		message.setMessage("кукла");
	}
}
