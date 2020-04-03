package u.savchuk.fragmentlog;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class SecondFrag extends Fragment {
    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment 2", "onCreate");
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, container, false);
        textView = view.findViewById(R.id.section_label);
        return view; //вызов компонентов внутри фрагмента
    }

    @Override
    public void onAttach(Activity activity) { //связвание фрагмента с активити
        super.onAttach(activity);
        Log.d("Fragment 2", "onAttach");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) { //фрагмент обращается к компонентам активности
        super.onActivityCreated(savedInstanceState);
        Log.d("Fragment 2", "onActivityCreated");
    }

    @Override
    public void onStart() { //фрагмент становится видимым
        super.onStart();
        Log.d("Fragment 2", "onStart");
    }

    @Override
    public void onResume() { // вызывается после onStart
        super.onResume();
        Log.d("Fragment 2", "onResume");
    }

    @Override
    public void onPause() { // свертывание фрагмента
        super.onPause();
        Log.d("Fragment 2", "onPause");
    }

    @Override
    public void onStop() { //скрытие фрагмента от пользователя
        super.onStop();
        Log.d("Fragment 2", "onStop");
    }

    @Override
    public void onDestroyView() { //удаление view из фрагмента
        super.onDestroyView();
        Log.d("Fragment 2", "onDestroyView");
    }

    @Override
    public void onDestroy() { //разрушение фрагмента
        super.onDestroy();
        Log.d("Fragment 2", "onDestroy");
    }

    @Override
    public void onDetach() { // фрагмент отвязывается от активности
        super.onDetach();
        Log.d("Fragment 2", "onDetach");
    }
}
