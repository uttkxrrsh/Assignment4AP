
public class Bob extends Toy {
	public Bob() {
		super.name = "Bob";
	}
	
	@Override
	public Bob clone() {
		Bob copy = (Bob) super.clone();
		return copy;
	}

}
