package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    final String TAG = "STATE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//вызывается шаблон layout интерфейса активности
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");//логирование OnCreate
    }

    @Override
    protected void onStart() {
        super.onStart();//вызывается при создании активности или перед восстановлением приостановленного приложения
        Log.d(TAG,"onStart"); //логирование onStart
    }

    @Override
    protected void onResume() {
        super.onResume();//вызывается после onStart когда пользователь взаимодействует с окном приложения
        Log.d(TAG,"onResume");//логирование onResume
    }

    @Override
    protected void onPause() {
        super.onPause();//свертывание текущей Activity (Чтобы вызвать только этот метод - достаточно, например, принять входящий звонок)
        Log.d(TAG,"onPause");//логирование onPause
    }

    @Override
    protected void onStop() {
        super.onStop();//Старт другой Activity, перекрывающей текущую. Объекты сохраняются в памяти
        Log.d(TAG, "onStop");//логирование onStop
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();//завершение работы Activity, ее уничтожение
        Log.d(TAG, "onDestroy");
    }
}
