
public class Victim implements Comparable<Victim>{
	private String name;
	private double amount;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Victim(String name, double amount) {
		setName(name);
		setAmount(amount);
	}
	
	public int compareTo(Victim o) {
		int result = 0;
		if (this.getAmount() < o.getAmount()) {
			result = 1; }
		else result = -1;
		return result;
	}

}
