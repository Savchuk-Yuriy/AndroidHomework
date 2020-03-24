package u.savchuk.fragmentlog;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class SecondFrag extends Fragment {
    public static SecondFrag newInstance() {
        return new SecondFrag();
    }
    public SecondFrag() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(), "FirstFragment.onCreate()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 2", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.second_fragment, container, false);
        Toast.makeText(getActivity(), "FirstFragment.onCreateView()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 2", "OnCreateView");
        return rootView; //вызов компонентов внутри фрагмента
    }

    @Override
    public void onAttach(Activity activity) { //связвание фрагмента с активити
        super.onAttach(activity);
        Toast.makeText(getActivity(), "SecondFragment.onAttach()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 2", "onAttach");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) { //фрагмент обращается к компонентам активности
        super.onActivityCreated(savedInstanceState);
        Toast.makeText(getActivity(), "SecondFragment.onActivityCreated()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 2", "onActivityCreated");
    }

    @Override
    public void onStart() { //фрагмент становится видимым
        super.onStart();
        Toast.makeText(getActivity(), "SecondFragment.onStart()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 2", "onStart");
    }

    @Override
    public void onResume() { // вызывается после onStart
        super.onResume();
        Toast.makeText(getActivity(), "SecondFragment.onResume()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 2", "onResume");
    }

    @Override
    public void onPause() { // свертывание фрагмента
        super.onPause();
        Toast.makeText(getActivity(), "SecondFragment.onPause()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 2", "onPause");
    }

    @Override
    public void onStop() { //скрытие фрагмента от пользователя
        super.onStop();
        Toast.makeText(getActivity(), "SecondFragment.onStop()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 2", "onStop");
    }

    @Override
    public void onDestroyView() { //удаление view из фрагмента
        super.onDestroyView();
        Toast.makeText(getActivity(), "SecondFragment.onDestroyView()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 2", "onDestroyView");
    }

    @Override
    public void onDestroy() { //разрушение фрагмента
        super.onDestroy();
        Toast.makeText(getActivity(), "SecondFragmment.onDestroy()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 2", "onDestroy");
    }

    @Override
    public void onDetach() { // фрагмент отвязывается от активности
        super.onDetach();
        Toast.makeText(getActivity(), "SecondFragment.onDetach()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 2", "onDetach");
    }
}
