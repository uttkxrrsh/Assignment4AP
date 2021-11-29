
public class Donald extends Toy {
	
	public Donald() {
		super.name = "Donald Duck";
	}
	
	@Override
	public Donald clone() {
		Donald copy = (Donald) super.clone();
		return copy;
	}
}
