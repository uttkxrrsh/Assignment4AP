
public class Jerry extends Toy {
	
	public Jerry() {
		super.name = "Jerry";
	}
	
	@Override
	public Jerry clone() {
		Jerry copy = (Jerry) super.clone();
		return copy;
	}
}
