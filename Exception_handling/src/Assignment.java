
public class Assignment {

	public static void main(String[] args) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new MyThreadException("Interrupeted exception");
		}
		System.out.println("After the try catch");

	}
}
