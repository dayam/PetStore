package tests;
import base.BaseClass;
import base.RestClient;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ConfigReader;
import static org.testng.Assert.*;


public class GetPetByID extends BaseClass {

    @Test
    public void getPetById() {
        int petId = 12;
        var response = RestClient.get(BaseClass.baseUrl + "/pet/" + petId);
        assertEquals(response.getStatusCode(), 200);
        assertTrue(response.getBody().asString().contains("id"));
    }

}
