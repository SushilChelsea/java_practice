class Batman {
	public String toString() {
		return "I'm Batman!";
	}
	public void finalize() {
		System.out.println("Batman Destroyed");
	}
}
public class Joker {
	public static void main(String[] args) throws InterruptedException {
		Batman bat = new Batman();
		System.out.println(bat);
		// bat = null;
		Thread.sleep(5000);
		System.gc();

	}
}
// object null eligible for garbage collection