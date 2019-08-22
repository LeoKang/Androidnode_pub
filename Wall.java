import java.util.Random;

public class Wall extends Map {

	public Wall() {
		RandomWall();
		for (int i = 0; i < Layers.length; i++) {
			for (int j = 0; j < getLayers()[i].length; j++) {
				if (i == 0 || j == 0 || j == 6 || i == 6) {
					getLayers()[i][j] = getW();
				} else {
					continue;
				}
			}
		}
	}

	static void RandomWall() {
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		int a = (int) ((10 * random.nextDouble()) % 10);
		if (a == 0) {
			a++;
		}
		if (a <= 3 && a > 0) {
			a = a * 2;
		}
		while (!(a == 0)) {
			int n1 = (int) ((10 * random.nextDouble()) % 10);
			int n2 = (int) ((10 * random.nextDouble()) % 10);
			if ((n1 >= 1 && n1 <= 6) && (n2 >= 1 && n2 <= 6)) {
				if (!(getLayers()[n1][n2] == getW()) && !(n1 == 1 && n2 == 1)) {
					getLayers()[n1][n2] = getW();
					a--;
				}
			}
		}

	}
}
