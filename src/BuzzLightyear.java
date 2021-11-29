
public class BuzzLightyear extends Toy {
	
	public BuzzLightyear() {
		super.name = "Buzz Lightyear";
	}
	
	@Override
	public BuzzLightyear clone() {
		BuzzLightyear copy = (BuzzLightyear) super.clone();
		return copy;
	}	
}
