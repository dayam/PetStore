package base;


import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;

public class BaseClass {
	public static String baseUrl;
	
	@BeforeMethod
    public void setup() throws Exception {
        ConfigReader.loadConfig();
        baseUrl = ConfigReader.get("base.url");
    }

}
