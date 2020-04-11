import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import sun.lwawt.macosx.CSystemTray;

public class Get_01 {

    @Test
    public void test(){

       Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.asString());
        System.out.println(response.getBody());
        System.out.println(response.getTime());
        System.out.println(response.getStatusCode() );
        System.out.println(response.getHeaders());


    }
}
