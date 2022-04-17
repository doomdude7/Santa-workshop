package factory;

public abstract class Toy {

	public Toy(ToyType type) {
		this.setType(type);
	}
	
	protected abstract void getToy();
	
	private ToyType type = null;
	
	public ToyType getType() {
		return type;
	}

	public void setType(ToyType type) {
		this.type = type;
	}
}
