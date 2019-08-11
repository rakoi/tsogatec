package www.digitalmould.ke.co.tsogatec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class SellElectricityActivity extends AppCompatActivity {

    Toolbar sellElectricityToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_electricity);

        sellElectricityToolbar=findViewById(R.id.sellElecticityToolbar);
        sellElectricityToolbar.setTitle("Sell Electricity");
        setSupportActionBar(sellElectricityToolbar);


    }
}
