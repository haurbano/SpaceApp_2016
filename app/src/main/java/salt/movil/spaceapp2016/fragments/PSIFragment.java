package salt.movil.spaceapp2016.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import salt.movil.spaceapp2016.R;
import salt.movil.spaceapp2016.net.ConsultaGet;

/**
 * A simple {@link Fragment} subclass.
 */
public class PSIFragment extends Fragment implements View.OnClickListener, ConsultaGet.Iresponse {
    Button btnCalPsi;
    TextView txtSensor, txtCalidadAire;

    public PSIFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_psi, container, false);
        btnCalPsi = (Button) v.findViewById(R.id.btn_psi);
        txtSensor = (TextView) v.findViewById(R.id.txt_sensor);
        txtCalidadAire = (TextView) v.findViewById(R.id.txt_calidad_aire);
        btnCalPsi.setOnClickListener(this);

        return  v;
    }

    @Override
    public void onClick(View v) {
        Get();
    }

    private void Get(){
        ConsultaGet consultaGet = new ConsultaGet(this);
        consultaGet.execute("hola");
    }

    @Override
    public void getReponse(String rta) {
        processResponse(rta);
    }

    private void processResponse(String rta)
    {
        Log.i("haurN","Response desde fragment: "+rta);
        try {
            JSONObject jsonObject = new JSONObject(rta);

        } catch (JSONException e) {
            Log.e("haur","No llega un Json: "+rta);
            e.printStackTrace();
        }
    }
}
