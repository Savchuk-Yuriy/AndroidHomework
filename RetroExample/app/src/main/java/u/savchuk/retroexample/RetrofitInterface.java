package u.savchuk.retroexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitInterface {
    // было изначально Call<List<ApiObject>> getAllPost();
    String BASE_URL = "https://jsonplaceholder.typicode.com/todos/";

    //@GET("/todos/{id}")
    @GET("1")
    Call<ApiObject> getAllPost();

    @GET("2")
    Call<ApiObject> getAllPost2();

    @GET("3")
    Call<ApiObject> getAllPost3();

    @GET("4")
    Call<ApiObject> getAllPost4();

}
