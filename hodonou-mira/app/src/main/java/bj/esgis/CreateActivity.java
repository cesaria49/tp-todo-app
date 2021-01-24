package bj.esgis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class CreateActivity extends AppCompatActivity implements View.OnClickListener {
    EditText mg;

    private Object EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        mg = (EditText) findViewById(R.id.Todo);

        Button btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        String message = mg.getText().toString();
        if (message.isEmpty()) {
            Context context = getApplicationContext();
            CharSequence text = "Saisir un message";
            int durer = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, durer);
            toast.show();
        } else {
            Intent intentionResultat = new Intent();
            intentionResultat.putExtra("tache", message);
            setResult(Activity.RESULT_OK, intentionResultat);
            finish();
        }
    }
}