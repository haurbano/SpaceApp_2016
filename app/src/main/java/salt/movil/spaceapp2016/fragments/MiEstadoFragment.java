package salt.movil.spaceapp2016.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import salt.movil.spaceapp2016.MainActivity;
import salt.movil.spaceapp2016.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MiEstadoFragment extends Fragment implements View.OnClickListener {

    LinearLayout feelOk, feelTos, feelDif, feelEstornudos, feelObstruccion, feelOjos;
    MainActivity mainActivity;


    public MiEstadoFragment() {
        // Required empty public constructor
    }

    public void init(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mi_estado, container, false);

        feelOk = (LinearLayout) v.findViewById(R.id.btn_feel_ok);
        feelTos = (LinearLayout) v.findViewById(R.id.btn_feel_tos);
        feelDif = (LinearLayout) v.findViewById(R.id.btn_feel_dif);
        feelEstornudos = (LinearLayout) v.findViewById(R.id.btn_feel_estornudo);
        feelObstruccion = (LinearLayout) v.findViewById(R.id.btn_feel_congestion);
        feelOjos = (LinearLayout) v.findViewById(R.id.btn_feel_ojos);

        feelOk.setOnClickListener(this);
        feelTos.setOnClickListener(this);
        feelDif.setOnClickListener(this);
        feelEstornudos.setOnClickListener(this);
        feelObstruccion.setOnClickListener(this);
        feelOjos.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_feel_ok:
                break;
            case R.id.btn_feel_tos:
                break;
            case R.id.btn_feel_dif:
                break;
            case R.id.btn_feel_estornudo:
                break;
            case R.id.btn_feel_congestion:
                break;
            case R.id.btn_feel_ojos:
                break;

        }
    }
}
