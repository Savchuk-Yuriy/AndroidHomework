package u.savchuk.retroexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    String BASE_URL = "https://jsonplaceholder.typicode.com/todos/";

    @GET("posts")
    Call<List<ApiObject>> getAllPost();
}
