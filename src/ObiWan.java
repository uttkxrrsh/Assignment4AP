
public class ObiWan extends Toy {
	public ObiWan() {
		super.name = "ObiWan";
	}
	
	@Override
	public ObiWan clone() {
		ObiWan copy = (ObiWan) super.clone();
		return copy;
	}
}
