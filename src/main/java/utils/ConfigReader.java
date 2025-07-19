package utils;
import java.io.FileInputStream;
import java.util.Properties;



public class ConfigReader {
	
	private static Properties props;

    public static void loadConfig() throws Exception {
        props = new Properties();
        FileInputStream fis = new FileInputStream("config/config.properties");
        props.load(fis);
    }

    public static String get(String key) {
        return props.getProperty(key);
    }

}
