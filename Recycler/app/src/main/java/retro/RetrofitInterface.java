import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import u.savchuk.recycler.ApiObject;

public interface RetrofitInterface {
    @GET("v2/5a96abc232000057005e2ed7")
    public Call<List<ApiObject>> getAllPost();
}
