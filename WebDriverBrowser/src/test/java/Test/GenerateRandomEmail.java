package Test;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomEmail {

	public static void main(String[] args) {

		//String a=RandomStringUtils.randomAlphabetic(5);
		String randomNum=RandomStringUtils.randomNumeric(3);
		String user="bluus.testing+";
		String domain="@gmail.com";
		String username=user+randomNum+domain;
		System.out.println(username);
		// System.out.println("bluustesting"+RandomStringUtils.randomAlphabetic(15)+RandomStringUtils.randomNumeric(4)+"gamil.com");  
		//System.out.println("bluus.testing"+"+"+b+"gmail.com");
		
		//System.out.println("bluus.testing"+a+b+"gmail.com");
		

	}

}
		