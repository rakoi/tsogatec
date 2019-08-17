package www.digitalmould.ke.co.tsogatec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class RegisterActivity extends AppCompatActivity {

    public Toolbar registerToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerToolbar=findViewById(R.id.registerToolbar);
        registerToolbar.setTitle("Register");

        setSupportActionBar(registerToolbar);
    }
}
