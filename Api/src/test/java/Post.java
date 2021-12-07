import com.github.tsohr.JSONArray;
import com.github.tsohr.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.Matchers.is;
public class Post {
    @Test
    public void postRequestExampleTest() {
        JSONArray body = new JSONArray();
        String someRandomString = String.format("%1$TH%1$TM%1$TS", new Date());
        JSONObject requestBody = new JSONObject();
        requestBody.put("FirstName", someRandomString);
        requestBody.put("LastName", someRandomString);
        requestBody.put("UserName", someRandomString);
        requestBody.put("Password", someRandomString);
        requestBody.put("Email", someRandomString + "@gmail.com");
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(requestBody.toString());
        Response response = request.post("https://webhook.site/5ee9f888-aea7-4d0c-b447-aad8f8ff4b7e");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        System.out.println("The status code recieved: " + statusCode);
}}
