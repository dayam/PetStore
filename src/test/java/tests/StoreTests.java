package tests;
import base.BaseClass;
import base.RestClient;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class StoreTests extends BaseClass {
	@Test
    public void getPetById() {
        var response = RestClient.get(BaseClass.baseUrl + "/store/inventory");
        assertEquals(response.getStatusCode(), 200);
        assertTrue(response.getBody().asString().contains("available"));
    }

}
