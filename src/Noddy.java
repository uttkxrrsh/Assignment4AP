
public class Noddy extends Toy {
	public Noddy() {
		super.name = "Noddy";
	}
	
	@Override
	public Noddy clone() {
		Noddy copy = (Noddy) super.clone();
		return copy;
	}
}
