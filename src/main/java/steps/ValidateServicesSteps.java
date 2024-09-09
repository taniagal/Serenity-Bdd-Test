package steps;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class ValidateServicesSteps {

    private Response response;

    public void consultListUsers() {
       response= given().log().all().contentType("application/json")
                .when().get("https://reqres.in/api/users?page=2");
    }

    public void validateListUsers() {
        response.then().log().all().body("total",equalTo(12));
        response.then().log().all().statusCode(200);
    }

    public void deleteUser() {
        response= given().log().all().contentType("application/json")
                .when().delete("https://reqres.in/api/users/2");
    }

    public void validateUserDeleted() {
        response.then().log().all().statusCode(204);
    }

    public void createUser() {
        response=given().log().all().contentType("application/json")
                .body("{\"name\":\"morpheus\", \"job\":\"leader\"}")
                .when().post("https://reqres.in/api/users");

    }

    public void validateUserCreation() {
        response.then().log().all().statusCode(201);
        response.then().log().all().body("name",equalTo("morpheus"));
    }

    public void updateUser() {
        response=given().log().all().contentType("application/json")
                .body("{\"name\":\"morpheus\", \"job\":\"zion resident\"}")
                .when().put("https://reqres.in/api/users/2");
    }

    public void validateUserUpdated(){
        response.then().log().all().statusCode(200);
        response.then().log().all().body("name",equalTo("morpheus"));
    }
}
