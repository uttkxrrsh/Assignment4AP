
public class Player {
	private Bucket bucket = new Bucket();
	
	public void printAllToys() {
		System.out.println("Softtoys won by you are:");
		for(Toy x: bucket.getToys()) {
			System.out.print(x + ": ");
		}
	}
	
	public void add(Toy toy) {
		bucket.getToys().add(toy);
	}
	
	public int hop(){
		int min = 1;
		int max = 21;
	    int random = (int)Math.floor(Math.random()*(max-min+1)+min);
	    return random;
	}
}
