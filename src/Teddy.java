
public class Teddy extends Toy{
	public Teddy() {
		super.name = "Teddy";
	}
	
	@Override
	public Teddy clone() {
		Teddy copy = (Teddy) super.clone();
		return copy;
	}
}
