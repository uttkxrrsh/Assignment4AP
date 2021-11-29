
public class Spiderman extends Toy {
	public Spiderman() {
		super.name = "Spiderman";
	}
	
	@Override
	public Spiderman clone() {
		Spiderman copy = (Spiderman) super.clone();
		return copy;
	}
}
