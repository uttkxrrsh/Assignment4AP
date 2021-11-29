
public class Tweety extends Toy {
	public Tweety() {
		super.name = "Tweety";
	}
	
	@Override
	public Tweety clone() {
		Tweety copy = (Tweety) super.clone();
		return copy;
	}

}
