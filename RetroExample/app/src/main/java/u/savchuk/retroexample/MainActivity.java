package u.savchuk.retroexample;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    List<ApiObject> apiObjectList;
    RecyclerView recyclerView;
    Retrofit retrofit;
    RecyclerViewAdapter userRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiObjectList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        getAllPost();
    }

    private void getAllPost() {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setMessage("Loading...");
        pd.show();
        retrofit = new  Retrofit
                .Builder()
                .baseUrl(RetrofitInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitInterface retrofitInterface = retrofit.create(RetrofitInterface.class);
        Call<List<ApiObject>> call = retrofitInterface.getAllPost();
        call.enqueue(new Callback<List<ApiObject>>() {

            @Override
            public void onResponse(Call<List<ApiObject>> call, Response<List<ApiObject>> response) {
                pd.dismiss();
                List<ApiObject> apiObjects = response.body();
                assert apiObjects != null;
                for (ApiObject u : apiObjects) {
                    ApiObject object = new ApiObject(u.getUserId(), u.getId(), u.getTitle(), u.getCompleted());
                    apiObjectList.add(object);
                }
                userRecyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(),apiObjectList);
                recyclerView.setAdapter(userRecyclerViewAdapter);
            }

            @Override
            public void onFailure(Call<List<ApiObject>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}

