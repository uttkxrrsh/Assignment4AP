
public class Oogway extends Toy {
	public Oogway() {
		super.name = "Oogway";
	}
	
	@Override
	public Oogway clone() {
		Oogway copy = (Oogway) super.clone();
		return copy;
	}
}
