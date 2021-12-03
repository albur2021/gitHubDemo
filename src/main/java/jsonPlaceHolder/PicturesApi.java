package jsonPlaceHolder;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class PicturesApi {

    static String url = "https://jsonplaceholder.typicode.com/photos/";
    static Response response = given().when().get(url);

    public static void main(String[] args) {
        //getAllPictures();
        //getPicturesStatus();
        //getById();
        getSomeIDs();
    }

    public static void getAllPictures(){
        response.thenReturn().body().prettyPrint();
    }

    public static void getPicturesStatus(){
        response.then().assertThat().statusCode(200).log().status();
    }

    public static void getById(){
        given().when().get(url + "/3").thenReturn().prettyPrint();
    }

    public static void getSomeIDs(){
        int [] arr = {1,4,6};
        for(int i : arr){
            given().when().get(url + String.valueOf(i)).thenReturn().prettyPrint();
        }
    }

}
