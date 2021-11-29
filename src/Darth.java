
public class Darth extends Toy {
	public Darth() {
		super.name = "Darth";
	}
	
	@Override
	public Darth clone() {
		Darth copy = (Darth) super.clone();
		return copy;
	}
}
