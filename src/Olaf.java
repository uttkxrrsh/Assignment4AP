
public class Olaf extends Toy{
	public Olaf() {
		super.name = "Olaf";
	}
	
	@Override
	public Olaf clone() {
		Olaf copy = (Olaf) super.clone();
		return copy;
	}

}
