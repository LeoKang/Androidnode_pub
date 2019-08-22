import java.util.Random;

public class Blank extends Wall {

	public Blank(){
		RandomBlank();
	}
	static void RandomBlank() {
		Random s = new Random();
		s.setSeed(System.currentTimeMillis());
		int e = 4;
		while (!(e == 0)) {
			setIb1((int) ((10 * s.nextDouble()) % 10));
			setIb2((int) ((10 * s.nextDouble()) % 10));
			if ((getIb1() >= 1 && getIb1() <= 6) && (getIb2() >= 1 && getIb2() <= 6)) {
				if (!(Map.getLayers()[getIb1()][getIb2()] == Map.getW())&& !(getIb1() == Character.getB() && getIb2() == Character.getC())&& !(getIb1() == Item.getIn1() && getIb2() == Item.getIn2())) {
					e--;
				}
			}
		}
	}
	public static void B_location() {
		System.out.print(Map.getBk() + " ");
	}
	

}
