package ba.vanjapetrovic.portfolio.app.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ba.vanjapetrovic.portfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyApps extends Fragment {


    public MyApps() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_apps, container, false);
    }

}
