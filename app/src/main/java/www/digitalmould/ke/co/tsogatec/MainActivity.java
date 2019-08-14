package www.digitalmould.ke.co.tsogatec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {



    public android.support.v7.widget.Toolbar toolbar;
    LinearLayout topUpPane,sellElecticityPane,soldTokens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.mainToolbar);
        toolbar.setTitle("Tsogatec");
        setSupportActionBar(toolbar);

        topUpPane=findViewById(R.id.topUpPanel);

        sellElecticityPane=findViewById(R.id.sellElecticity);
        soldTokens=findViewById(R.id.soldTokens);

        sellElecticityPane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SellElectricityActivity.class));
            }
        });

        topUpPane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TopUpAccount.class));
            }
        });

        soldTokens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SoldTokens.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
