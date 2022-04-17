package factory;

public class RunToFactory {

	public void getToyDollFromFactory(){
		System.out.println(ToyFactory.takeToy(ToyType.DOLL));
		System.out.println("Куклата е взета!");
	}
	public void getToyBikeFromFactory(){
		System.out.println(ToyFactory.takeToy(ToyType.BIKE));
		System.out.println("Колелото е взето!");
	}
}
