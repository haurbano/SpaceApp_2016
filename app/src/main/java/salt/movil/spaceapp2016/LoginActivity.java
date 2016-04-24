package salt.movil.spaceapp2016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnFacebook,btnGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnFacebook = (Button) findViewById(R.id.btn_facebook);
        btnGoogle = (Button) findViewById(R.id.btn_google);

        btnFacebook.setOnClickListener(this);
        btnGoogle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_facebook:
                Intent intent = new Intent(this,FacebookConfirmActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_google:
                break;
        }
    }
}
