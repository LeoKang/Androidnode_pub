import java.util.Random;

public class Item {
	private static char I_t;
	private static int in1 = 0;
	private static int in2 = 0;

	public Item() {
		I_t = '$';
		RandomItem();
	}

	public static void Itemsetting() {
		RandomItem();
	}

	private static void RandomItem() {
		Random s = new Random();
		s.setSeed(System.currentTimeMillis());
		int e = 1;
		while (!(e == 0)) {
			in1 = (int) ((10 * s.nextDouble()) % 10);
			in2 = (int) ((10 * s.nextDouble()) % 10);
			if ((in1 >= 1 && in1 <= 6) && (in2 >= 1 && in2 <= 6)) {
				if (!(Map.getLayers()[in1][in2] == Map.getW())
						&& !(in1 == Character.getB() && in2 == Character.getC())) {
					e--;
				}
			}
		}
	}

	public static int getIn1() {
		return in1;
	}

	public void setIn1(int in1) {
		Item.in1 = in1;
	}

	public static int getIn2() {
		return in2;
	}

	public void setIn2(int in2) {
		Item.in2 = in2;
	}

	public static void I_location() {
		System.out.print(I_t + " ");
	}
}
