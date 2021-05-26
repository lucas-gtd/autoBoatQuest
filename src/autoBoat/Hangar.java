package autoBoat;

public class Hangar {

	public static void main(String[] args) {
		Car clio = new Car("Clio", 182);
		Boat peniche = new Boat("Péniche", 84);
		System.out.println(clio.doStuff());
		System.out.println(peniche.doStuff());
	}

}
