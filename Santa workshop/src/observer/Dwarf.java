package observer;

public class Dwarf implements Observer {

	private String name;
	private Observable message;
	
	public Dwarf(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		
		if(this.message == null) {
			System.out.println("Няма зададено съобщение на магическата дъска");
			return;
		}
		
		String magicBoardMessage = this.message.getUpdate();
		System.out.println(this.name + " *чете магическата дъска и си мисли* : трябва да взема от фабриката " + magicBoardMessage);
	}

	@Override
	public void setMessage(Observable message) {
		this.message = message;
	}

}
