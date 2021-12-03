package jsonPlaceHolder;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class ToDoApi {

    static String url = "https://jsonplaceholder.typicode.com/todos/";
    static Response result = given().when().get(url);

    public static void main(String[] args) {
       // getAllToDos();
        //getStatus();
        //getSomeUsers();
        getUserByID();
    }
    public static void getAllToDos(){
        result.thenReturn().body().prettyPrint();
    }
    public static void getStatus(){
        //result.then().assertThat().statusCode(200).log().status();
      int status = result.thenReturn().statusCode();
        System.out.println(status);
    }

public static void getUserByID(){
    given().when().get(url + "2").thenReturn().prettyPrint();
}

    public static void getSomeUsers(){
        int []arr = {2,4,6,8};
        for(int i: arr){
            given().when().get(url + String.valueOf(i)).thenReturn().prettyPrint();

        }
    }
}
