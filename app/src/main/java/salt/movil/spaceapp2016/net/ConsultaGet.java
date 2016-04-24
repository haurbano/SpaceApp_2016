package salt.movil.spaceapp2016.net;

import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class ConsultaGet extends AsyncTask<String,Integer,String> {
    public static final String LATITUD = "4.710988599999999";
    public static final String LONGITUD = "-74.072092";
    public static final String URL = "http://query.yahooapis.com/v1/public/yql?q=select%20item%20from%20weather.forecast%20where%20location%3D%2248907%22&format=json";
    public static final String URL2 = "http://api.spaceapps-diegoalvis.c9users.io/locations?lat="+LATITUD+"&long="+LONGITUD;
    String rta;

    public interface Iresponse{
        void getReponse(String rta);
    }

    Iresponse iresponse;

    public ConsultaGet(Iresponse iresponse) {
        this.iresponse = iresponse;
    }

    @Override
    protected String doInBackground(String... params) {
        HttpClient httpClient;
        httpClient = new DefaultHttpClient();
        HttpGet request = new HttpGet(URL2);
        try {
            HttpResponse response = httpClient.execute(request);
            rta = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            Log.e("haurN","Error en get: "+ e.toString());
        }
        return rta;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Log.i("haurN","Respuesta:" +s);
        iresponse.getReponse(s);
    }
}
