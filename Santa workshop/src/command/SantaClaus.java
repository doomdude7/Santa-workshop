package command;

public class SantaClaus {

	ICommand command;
	
	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void writeOnMagicBoard() {
		command.execute();
	}
	
}
