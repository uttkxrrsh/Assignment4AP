
public class IronMan extends Toy {
	public IronMan() {
		super.name = "Iron Man";
	}
	
	@Override
	public IronMan clone() {
		IronMan copy = (IronMan) super.clone();
		return copy;
	}
}
