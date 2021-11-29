
public class Harry extends Toy {
	public Harry() {
		super.name = "Harry Potter";
	}
	
	@Override
	public Harry clone() {
		Harry copy = (Harry) super.clone();
		return copy;
	}
}
