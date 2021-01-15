package om.trade.enums;

public class EnumTest {

	EnumTest() {
		System.out.println("this is 0 param constructor");
	}

	void test() {
		Weeks saturday = Weeks.SATURDAY;
		String name = saturday.getName();
		String methodTest = saturday.methodTest();
		System.out.println(methodTest);
		saturday.name = "sandeep";
		System.out.println(saturday.name);
	}

	public static void main(String[] args) {
		EnumTest test = new EnumTest();
		test.test();
	}

}
