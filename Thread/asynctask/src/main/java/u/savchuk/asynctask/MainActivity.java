package u.savchuk.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInfoTextView = findViewById(R.id.text_info);
    }

    public void onClick(View v) {
        CatTask catTask = new CatTask();
        catTask.execute();
    }

    class CatTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mInfoTextView.setText("Cat is going to climb a roof");
        }

        @Override
        protected Void doInBackground(Void...voids) {
            try{
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            mInfoTextView.setText("Cat is climbing a roof right now!");
        }
    }
}
