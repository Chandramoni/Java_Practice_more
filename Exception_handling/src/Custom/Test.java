package Custom;

public class Test {

	public static void main(String[] args) throws CheckedCustomException {
		// throw new UncheckedCustomException("BUsiness exception occurred");
		throw new CheckedCustomException("BUsiness exception that needs to be handled");
	}

}
