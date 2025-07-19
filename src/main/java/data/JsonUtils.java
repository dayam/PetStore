package data;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Map;


public class JsonUtils {
	public static Map<String, Object> readJsonAsMap(String filePath) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(filePath), Map.class);
    }
}
