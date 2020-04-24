package automationTestCases;

import automationTestCases.InputChar.PermittedCharacters;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class GenerateRandomData {

public static String Random(int Length, PermittedCharacters permittedCharacters)
{
	String randomString = null;
	
	if(PermittedCharacters.ALPHABETS.equals(permittedCharacters)) 
	{
		randomString = randomString(Length);
	}
		
	return randomString;
	
}

public static String randomString(int Length)
{
	return RandomStringUtils.randomAlphabetic(Length);
	
}
public static String randomInteger(int Length)
{
	return RandomStringUtils.randomNumeric(Length);
}

public static String randomAlphanumeric(int Length)
{
return RandomStringUtils.randomAlphanumeric(Length);
}
}
