
public class Winnie extends Toy {
	public Winnie() {
		super.name = "Winnie";
	}
	
	@Override
	public Winnie clone() {
		Winnie copy = (Winnie) super.clone();
		return copy;
	}
}
