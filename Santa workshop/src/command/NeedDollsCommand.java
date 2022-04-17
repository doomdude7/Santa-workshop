package command;

public class NeedDollsCommand implements ICommand {

	ToyDoll doll;
	
	public NeedDollsCommand(ToyDoll doll) {
		super();
		this.doll = doll;
	}

	@Override
	public void execute() {
		System.out.println("Дядо Коледа: Трябват ми кукли!");
		doll.writeDoll();
	}

}
