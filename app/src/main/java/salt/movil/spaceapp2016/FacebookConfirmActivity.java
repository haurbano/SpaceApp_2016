package salt.movil.spaceapp2016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FacebookConfirmActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnOk, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_confirm);

        btnOk = (Button) findViewById(R.id.btn_ok_facebook);
        btnCancel = (Button) findViewById(R.id.btn_cancel_facebook);

        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_cancel_facebook:
                Intent intent = new Intent(this,LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_ok_facebook:
                Intent intent2 = new Intent(this,MainActivity.class);
                startActivity(intent2);
                finish();
                break;
        }
    }
}
