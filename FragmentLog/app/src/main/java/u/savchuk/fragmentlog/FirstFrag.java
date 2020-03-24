package u.savchuk.fragmentlog;

import androidx.lifecycle.ViewModelProviders;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class FirstFrag extends Fragment {
    public static FirstFrag newInstance() {
        return new FirstFrag();
    }
    public FirstFrag() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(), "FirstFragment.onCreate()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 1", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.first_fragment, container, false);
        Toast.makeText(getActivity(), "FirstFragment.onCreateView()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 1", "OnCreateView");
        return rootView; //вызов компонентов внутри фрагмента
    }

    @Override
    public void onAttach(Activity activity) { //связвание фрагмента с активити
        super.onAttach(activity);
        Toast.makeText(getActivity(), "FirstFragment.onAttach()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 1", "onAttach");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) { //фрагмент обращается к компонентам активности
        super.onActivityCreated(savedInstanceState);
        Toast.makeText(getActivity(), "FirstFragment.onActivityCreated()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 1", "onActivityCreated");
    }

    @Override
    public void onStart() { //фрагмент становится видимым
        super.onStart();
        Toast.makeText(getActivity(), "FirstFragment.onStart()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 1", "onStart");
    }

    @Override
    public void onResume() { // вызывается после onStart
        super.onResume();
        Toast.makeText(getActivity(), "FirstFragment.onResume()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 1", "onResume");
    }

    @Override
    public void onPause() { // свертывание фрагмента
        super.onPause();
        Toast.makeText(getActivity(), "FirstFragment.onPause()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 1", "onPause");
    }

    @Override
    public void onStop() { //скрытие фрагмента от пользователя
        super.onStop();
        Toast.makeText(getActivity(), "FirstFragment.onStop()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 1", "onStop");
    }

    @Override
    public void onDestroyView() { //удаление view из фрагмента
        super.onDestroyView();
        Toast.makeText(getActivity(), "FirstFragment.onDestroyView()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 1", "onDestroyView");
    }

    @Override
    public void onDestroy() { //разрушение фрагмента
        super.onDestroy();
        Toast.makeText(getActivity(), "FirstFragmment.onDestroy()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 1", "onDestroy");
    }

    @Override
    public void onDetach() { // фрагмент отвязывается от активности
        super.onDetach();
        Toast.makeText(getActivity(), "FirstFragment.onDetach()", Toast.LENGTH_LONG).show();
        Log.d("Fragment 1", "onDetach");
    }
}
