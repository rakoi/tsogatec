package www.digitalmould.ke.co.tsogatec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    Toolbar profileToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profileToolbar=findViewById(R.id.profileToolbar);
        profileToolbar.setTitle("Profile");
        profileToolbar.setNavigationIcon(R.drawable.backicon);

        setSupportActionBar(profileToolbar);
        profileToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
               startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });




    }
}
