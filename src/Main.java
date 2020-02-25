import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		ArrayList<Victim> x = new ArrayList<Victim>();
		x.add(new Victim("Miranda", 5000000));
		x.add(new Victim("Chuck", 3));
		x.add(new Victim ("Reginald", 30));
		Collections.sort(x);
		for (int i = 0; i < x.size(); i++) {
			Victim tmp = x.get(i);
			System.out.println(tmp.getName() + " | Amount Scammed: $" + tmp.getAmount());
		}

	}

}
