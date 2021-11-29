
public class Minion extends Toy{
	public Minion() {
		super.name = "Minion";
	}
	
	@Override
	public Minion clone() {
		Minion copy = (Minion) super.clone();
		return copy;
	}
}
