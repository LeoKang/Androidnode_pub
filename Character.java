
public class Character {
	private static int b = 1;
	private static int c = 1;
	private int stemina;
	private int input;
	private boolean GO = true;
	private static char model;;

	public Character() {
	}

	public Character(int stemina) {
		this.setStemina(stemina);
		model = '@';
	}

	public int getStemina() {
		return stemina;
	}

	public void setStemina(int stemina) {
		this.stemina = stemina;
	}

	public boolean Movement(char input) {
		this.setInput(input);
		switch (input) {
		case '1':
			if (Map.getLayers()[getB() + 1][getC() - 1] != Map.getW()) {
				setB(getB() + 1);
				setC(getC() - 1);
				stemina--;
			}
			break;
		case '2':
			if (Map.getLayers()[getB() + 1][getC()] != Map.getW()) {
				setB(getB() + 1);
				stemina--;
			}
			break;
		case '3':
			if (Map.getLayers()[getB() + 1][getC() + 1] != Map.getW()) {
				setB(getB() + 1);
				setC(getC() + 1);
				stemina--;
			}
			break;
		case '4':
			if (Map.getLayers()[getB()][getC() - 1] != Map.getW()) {
				setC(getC() - 1);
				stemina--;
			}
			break;
		case '6':
			if (Map.getLayers()[getB()][getC() + 1] != Map.getW()) {
				setC(getC() + 1);
				stemina--;
			}
			break;
		case '7':
			if (Map.getLayers()[getB() - 1][getC() - 1] != Map.getW()) {
				setB(getB() - 1);
				setC(getC() - 1);
				stemina--;
			}
			break;
		case '8':
			if (Map.getLayers()[getB() - 1][getC()] != Map.getW()) {
				setB(getB() - 1);
				stemina--;
			}
			break;
		case '9':
			if (Map.getLayers()[getB() - 1][getC() + 1] != Map.getW()) {
				setB(getB() - 1);
				setC(getC() + 1);
				stemina--;
			}
			break;

		case 'q':
		case 'Q':
			setGO(false);
		}
		if (getB() == Item.getIn1() && getC() == Item.getIn2()) {
			stemina += 3;
			Item.Itemsetting();			
		}
		if (getB() == Blank.getIb1() && getC() == Blank.getIb2()) {
			stemina -= 1;
		}
		if (stemina == 0) {
				setGO(false);
		}
		return isGO();
	}

	public int getInput() {
		return input;
	}

	public void setInput(char input) {
		this.input = input;
	}

	public static void C_location() {
		System.out.print(model + " ");
	}

	public boolean isGO() {
		return GO;
	}

	public void setGO(boolean gO) {
		GO = gO;
	}

	public static int getB() {
		return b;
	}

	public void setB(int b) {
		Character.b = b;
	}

	public static int getC() {
		return c;
	}

	public void setC(int c) {
		Character.c = c;
	}
}
