
public class BumbleBee extends Toy {
	public BumbleBee() {
		super.name = "Bumblebee";
	}
	
	@Override
	public BumbleBee clone() {
		BumbleBee copy = (BumbleBee) super.clone();
		return copy;
	}
}
