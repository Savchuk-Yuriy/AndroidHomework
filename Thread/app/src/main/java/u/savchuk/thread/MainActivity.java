package u.savchuk.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        WorkingClass workingClass = new WorkingClass();
        Thread thread = new Thread(workingClass);
        thread.start();
    }

    class WorkingClass implements Runnable {
        @Override
        public void run() {
            textView.post(new Runnable() {
                @Override
                public void run() {
                    textView.setText("Yeeha, It's working!");
                }
            });
        }
    }
}
