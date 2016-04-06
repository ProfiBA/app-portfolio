package ba.vanjapetrovic.portfolio.app.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ba.vanjapetrovic.portfolio.R;
import ba.vanjapetrovic.portfolio.app.utils.showToast;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class NanoDegree extends Fragment {

    public NanoDegree() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //TODO: Make cardview insted of buttons
        View rootView = inflater.inflate(R.layout.fragment_nano_degree, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    @OnClick({ R.id.btnAppOne, R.id.btnAppTwo, R.id.btnAppThree, R.id.btnAppFour, R.id.btnAppFive, R.id.btnAppSix})
    public void submit(View view) {
      new showToast(this.getContext(), getString(R.string.toast_app_click));
    }

}
