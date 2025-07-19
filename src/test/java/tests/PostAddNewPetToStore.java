package tests;

import base.BaseClass;
import base.RestClient;
import data.RequestPayload;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class PostAddNewPetToStore extends BaseClass{
	
	RequestPayload reqPayload = new RequestPayload();
	
	@Test
	public void postPetByValidDetails() {
        var response = RestClient.post(BaseClass.baseUrl + "/pet", reqPayload.postPayLoad());
        assertEquals(response.getStatusCode(), 200);
        assertTrue(response.getBody().asString().contains("name"));
    }

}
