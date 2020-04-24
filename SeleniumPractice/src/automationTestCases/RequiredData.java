package automationTestCases;

public class RequiredData {

	public static void main(String[] args) {
	System.out.println(GenerateRandomData.randomString(12));
	System.out.println(GenerateRandomData.randomString(25));
	System.out.println(GenerateRandomData.randomInteger(20));
	System.out.println(GenerateRandomData.randomAlphanumeric(20).toUpperCase());

	}

}
