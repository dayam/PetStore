package data;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.lang3.RandomStringUtils;

import utils.RandomGenAIUtility;

public class RequestPayload {
	RandomGenAIUtility renSter = new RandomGenAIUtility();
	static final String available ="available";
	static final String pending ="pending";
	static final String sold ="sold";
	
	public static Object postPayLoad() {
		Map<String, Object> pet = new HashMap<>();
		pet.put("id", RandomGenAIUtility.randomNum());
		pet.put("name", RandomGenAIUtility.randomStr());
		pet.put("status", available);
		return pet;
	}
	

}
