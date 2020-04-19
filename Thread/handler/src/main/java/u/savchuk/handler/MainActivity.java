package u.savchuk.handler;
//пример реализации с сайта Александра Климова
// в отдельном потоке идет тайминг, в другом подсчет кликов

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // считаем нажатия кнопки
    private int mButtonPressed = 0;

    // счетчик времени
    private long mTime = 0L;

    private TextView mCounterTextView;
    private TextView mTimeTextView;

    // обработчик потока - обновляет сведения о времени
    // Создаётся в основном UI-потоке
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTimeTextView = findViewById(R.id.textViewTime);
        mCounterTextView = findViewById(R.id.textViewCounter);

        if (mTime == 0L) {
            mTime = SystemClock.uptimeMillis();
            mHandler.removeCallbacks(timeUpdaterRunnable);
            // Добавляем Runnable-объект timeUpdaterRunnable в очередь
            // сообщений, объект должен быть запущен после задержки в 100 мс
            mHandler.postDelayed(timeUpdaterRunnable, 100);
        }
    }

    // Описание Runnable-объекта
    private Runnable timeUpdaterRunnable = new Runnable() {
        @Override
        public void run() {
            //вычисляем время
            final long start = mTime;
            long millis = SystemClock.uptimeMillis() - start;
            int second = (int) (millis/1000);
            int min = second / 60;
            second = second % 60;
            //выводим время
            mTimeTextView.setText("" + min + ":" + String.format("%02d", second));
            //повторяем через каждые 200 миллисекунд
            mHandler.postDelayed(this,200);
        }
    };

    @Override
    protected void onPause() {
    //удаляем Runnable-объект для прекращения задачи
        mHandler.removeCallbacks(timeUpdaterRunnable);
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //добавялем Runnable-объект
        mHandler.postDelayed(timeUpdaterRunnable, 100);
    }

    public void onClick(View v) {
        mCounterTextView.setText("" + ++mButtonPressed);
    }
}