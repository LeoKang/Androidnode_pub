
public class Map {
	protected static char[][] Layers = new char[7][7];
	private static int ib1 = 0;
	private static int ib2 = 0;
	private char a = 65;
	private static char w = '#';
	private static char Bk = ' ';
	public Map() {
		for (int i = 0; i < getLayers().length; i++) {
			for (int j = 0; j < getLayers()[i].length; j++) {
				if (i == 0 || j == 0 || j == 6 || i == 6) {
					continue;
				} else {
					getLayers()[i][j] = a;
					a++;
				}
			}
		}

	}

	public void Show() {
		for (int i = 0; i < getLayers().length; i++) {
			for (int j = 0; j < getLayers()[i].length; j++) {
				if (i == Character.getB() && j == Character.getC()) {
					Character.C_location();
					continue;
				}
				if (i == Item.getIn1() && j == Item.getIn2()) {
					Item.I_location();
					continue;
				}
				if (i == ib1 && j == ib2) {
					Blank.B_location();
					continue;
				}
				System.out.print(getLayers()[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("Input number... : ");
		System.out.println();
	}

	public static char getW() {
		return w;
	}

	public static void setW(char w) {
		Map.w = w;
	}

	public static char[][] getLayers() {
		return Layers;
	}

	public static void setLayers(char[][] layers) {
		Layers = layers;
	}

	public static char getBk() {
		return Bk;
	}

	public static void setBk(char bk) {
		Bk = bk;
	}

	public static int getIb1() {
		return ib1;
	}

	public static void setIb1(int ib1) {
		Map.ib1 = ib1;
	}

	public static int getIb2() {
		return ib2;
	}

	public static void setIb2(int ib2) {
		Map.ib2 = ib2;
	}

}
