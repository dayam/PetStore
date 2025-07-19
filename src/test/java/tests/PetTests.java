package tests;
import base.BaseClass;
import base.RestClient;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ConfigReader;
import static org.testng.Assert.*;


public class PetTests extends BaseClass {
	//String baseUrl;

//    @BeforeClass
//    public void setup() throws Exception {
//        ConfigReader.loadConfig();
//        baseUrl = ConfigReader.get("base.url");
//    }

    @Test
    public void getPetById() {
        int petId = 1;
        var response = RestClient.get(BaseClass.baseUrl + "/pet/" + petId);
        assertEquals(response.getStatusCode(), 200);
        assertTrue(response.getBody().asString().contains("id"));
    }

}
