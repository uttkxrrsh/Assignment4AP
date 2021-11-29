
public class Toy implements Cloneable{
	protected String name;
	
	public Toy clone(){
		try {
			Toy copy = (Toy) super.clone();
			return copy;
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	public String toString() {
		return name;
	}
}
