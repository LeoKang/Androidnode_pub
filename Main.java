import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map[] layers = new Map[3];
		Character[] Players = new Character[1];
		Item[] Items = new Item[1];

		layers[0] = new Map();
		layers[1] = new Wall();
		layers[2] = new Blank();
		Players[0] = new Character(5);
		Items[0] = new Item();

		char input = '0';

		do {
			layers[2].Show();
			input = sc.next().charAt(0);
			Players[0].Movement(input);

			System.out.println("HP : " + Players[0].getStemina());
		} while (Players[0].isGO());
		sc.close();
		System.out.println("Game Over...");
	}
}