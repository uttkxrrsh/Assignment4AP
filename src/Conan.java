
public class Conan extends Toy {
	public Conan() {
		super.name = "Spiderman";
	}
	
	@Override
	public Conan clone() {
		Conan copy = (Conan) super.clone();
		return copy;
	}
}
