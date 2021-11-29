import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
	private static Carpet carpet = new Carpet();
	private static Tile[] tiles = carpet.getTile();
	private static Player player = new Player();
	private static Calculator<String> strcal = new Calculator<String>();
	private static Calculator<Integer> intcal = new Calculator<Integer>();
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		int hop = 0;
		int val;
		int term = 0;
		int num1 = 1;
		int num2 = 1;
		int num3 = 1;
		String str1;
		String str2;
		String str3;
		boolean flag = true;
		System.out.println("Hit Enter to initialize the game");
		sc.nextLine();
		System.out.println("Game is ready");
		while(hop!=5) {
			if(hop == 0) {
				System.out.println("Hit enter for your first hop");
				sc.nextLine();
			}
			if(hop == 1) {
				System.out.println("Hit enter for your second hop");
				sc.nextLine();
			}
			if(hop == 2) {
				System.out.println("Hit enter for your third hop");
				sc.nextLine();
			}
			if(hop == 3) {
				System.out.println("Hit enter for your fourth hop");
				sc.nextLine();
			}
			if(hop == 4) {
				System.out.println("Hit enter for your fifth hop");
				sc.nextLine();
			}
			hop++;
			val = player.hop();
			if(val == 21) {
				System.out.println("You are too energetic and zoomed past all the tiles. Muddy Puddle Splash!");
			}
			else if(val % 2 == 0) {
				System.out.println("You landed on tile " + val);
				try {
					player.add(tiles[val-1].getToy().clone());
				}
				catch(IndexOutOfBoundsException e){
					System.out.println("Index out of bound");
				}
				System.out.println("You won a " + tiles[val-1].getToy());
			}
			else {
				System.out.println("You landed on tile " + val);
				flag = true;
				while(flag) {
					try {
						term = getInput();
						flag = false;
					}
					catch(WrongInputException e){
						System.out.println(e.getMessage());
					}
				}
				if(term == 1) {
					num1 = create1();
					num2 = create2();
					System.out.println("Calculate the result of " + num1 + " divided by " +num2);
					try {
						num3 = sc.nextInt();
					}
					catch(InputMismatchException e) {
						System.out.println("Wrong Type Answer");
						System.out.println("You did not win any soft toy");
						continue;
					}
					if(intcal.calculate(num1, num2, num3)) {
						try {
							player.add(tiles[val-1].getToy().clone());
						}
						catch(IndexOutOfBoundsException e){
							System.out.println("Index out of bound");
						}
						System.out.println("Correct Answer");
						System.out.println("You won a " + tiles[val-1].getToy());
					}
					else {
						System.out.println("Wrong Answer");
						System.out.println("You did not win any soft toy");
						continue;
					}
				}
				else if(term == 2) {
					str1 = create3();
					str2 = create3();
					System.out.println("Calculate the concatenation of strings " + str1 + " and " + str2);
					try {
						str3 = sc.nextLine();
					}
					catch(InputMismatchException e) {
						System.out.println("Wrong Type Answer");
						System.out.println("You did not win any soft toy");
						continue;
					}
					if(strcal.calculate(str1, str2, str3)) {
						try {
							player.add(tiles[val-1].getToy().clone());
						}
						catch(IndexOutOfBoundsException e){
							System.out.println("Index out of bound");
						}
						System.out.println("Correct Answer");
						System.out.println("You won a " + tiles[val-1].getToy());
					}
					else {
						System.out.println("Wrong Answer");
						System.out.println("You did not win any soft toy");
						continue;
					}
				}
			}
		}
		player.printAllToys();
	}
	
	public static int create1() {
		int min = 0;
	    int max = 10000;
	    int random = (int)Math.floor(Math.random()*(max-min+1)+min);
	    return random;
	}
	public static int create2() {
		int min = 1;
	    int max = 10000;
	    int random = (int)Math.floor(Math.random()*(max-min+1)+min);
	    return random;
	}
	public static String create3() {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz";
		StringBuilder s = new StringBuilder(4);
		for(int i = 0; i<4; i++) {
			int build = (int)(str.length()*Math.random());
			s.append(str.charAt(build));
		}
		return s.toString();
	}
	
	public static int getInput() throws WrongInputException{
		System.out.println("Question answer round. Integer or strings?");
		String str = sc.nextLine();
		if(str.toLowerCase().equals("string") || str.toLowerCase().equals("strings")) {
			return 2;
		}
		else if(str.toLowerCase().equals("integer") || str.toLowerCase().equals("integers")) {
			return 1;
		}
		else {
			throw new WrongInputException("Wrong input try again");
		}
	}
}
