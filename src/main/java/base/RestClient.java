package base;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class RestClient {
	
	
	public static Response get(String endpoint) {
        return given().log().all().get(endpoint);
    }

    public static Response post(String endpoint, Object body) {
        return given().log().all().header("Content-Type", "application/json")
                .body(body).post(endpoint);
    }

    public static Response put(String endpoint, Object body) {
        return given().log().all().header("Content-Type", "application/json")
                .body(body).put(endpoint);
    }

    public static Response delete(String endpoint) {
        return given().log().all().delete(endpoint);
    }

}
