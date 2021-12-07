import com.github.tsohr.JSONArray;
import com.github.tsohr.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Put {
    @Test
    public void UpdateRecordsWinthPut(){
        int empid = 15410;
        RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1/";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "TestDate");
        requestParams.put("age", 23);
        requestParams.put("salary", 12000);
        request.body(requestParams.toString());
        Response response = request.put("/update/"+ empid);
        int statusCode = response.getStatusCode();
        System.out.println(response.asString());
        Assert.assertEquals(statusCode, 200);
    }
}
