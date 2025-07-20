package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import base.BaseClass;
import base.RestClient;

public class DeletesApet extends BaseClass{

	 @Test
	    public void getPetById() {
	        var response = RestClient.delete(BaseClass.baseUrl + "/pet/1");
	        assertEquals(response.getStatusCode(), 404);
	    }

}
