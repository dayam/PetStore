package utils;

import java.util.Random;
import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomGenAIUtility {

	public static String randomStr() {
//		String randomStr = UUID.randomUUID().toString();
//		System.out.println(randomStr);
		String randomStr1 = RandomStringUtils.randomAlphanumeric(14); // 14-char string
		return randomStr1;
	}
	
	public static int randomNum() {
		Random random = new Random();
		// 0 to 10000
        int randomInt = random.nextInt(10000);
        return randomInt;
	}
	
	
}
