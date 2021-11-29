
public class Woody extends Toy {
	public Woody() {
		super.name = "Woody";
	}
	
	@Override
	public Woody clone() {
		Woody copy = (Woody) super.clone();
		return copy;
	}
}
