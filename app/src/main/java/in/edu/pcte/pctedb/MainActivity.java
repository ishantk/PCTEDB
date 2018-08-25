package in.edu.pcte.pctedb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // References
    EditText eTxtEmail;
    EditText eTxtPassword;

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTxtEmail = findViewById(R.id.editTextEmail);
        eTxtPassword = findViewById(R.id.editTextPassword);

        // Object Creation : Model
        user = new User();
    }


    public void clickHandler(View view){

        user.email = eTxtEmail.getText().toString();
        user.password = eTxtPassword.getText().toString();

    }
}
