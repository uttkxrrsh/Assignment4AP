
public class Hulk extends Toy {
	public Hulk() {
		super.name = "Hulk";
	}
	
	@Override
	public Hulk clone() {
		Hulk copy = (Hulk) super.clone();
		return copy;
	}

}
