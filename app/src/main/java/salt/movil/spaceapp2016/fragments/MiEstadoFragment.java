package salt.movil.spaceapp2016.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import salt.movil.spaceapp2016.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MiEstadoFragment extends Fragment {


    public MiEstadoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mi_estado, container, false);
    }

}
