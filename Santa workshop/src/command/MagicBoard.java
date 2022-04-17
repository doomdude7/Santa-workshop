package command;

import factory.RunToFactory;
import observer.MagicalBoard;

public class MagicBoard {

	public void getMeToys(){
		ToyBike toybike = new ToyBike();
		ToyDoll toydoll = new ToyDoll();
		SantaClaus santa = new SantaClaus();
		
		RunToFactory factory = new RunToFactory();
		MagicalBoard magicboard = new MagicalBoard();
		
		
		santa.setCommand(new NeedBikesCommand( toybike ));
		santa.writeOnMagicBoard();
		magicboard.watchBoardBike();
		factory.getToyBikeFromFactory();
		
		System.out.println("-------------------------");
		
		santa.setCommand(new NeedDollsCommand( toydoll ));
		santa.writeOnMagicBoard();
		magicboard.watchBoardDoll();
		factory.getToyDollFromFactory();
	}

}
