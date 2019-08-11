package www.digitalmould.ke.co.tsogatec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class TopUpAccount extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up_account);
        toolbar=findViewById(R.id.topUpToolbar);

        toolbar.setTitle("Top Up");

    }

}
