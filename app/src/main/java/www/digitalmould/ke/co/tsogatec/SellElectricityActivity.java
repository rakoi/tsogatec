package www.digitalmould.ke.co.tsogatec;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class SellElectricityActivity extends AppCompatActivity {


    Toolbar sellElectricityToolbar;
    public EditText meterNumber,PhoneNo,Amount;
    public Button sellbutton;
    public View dialogView;
    public TextView sellWarning, currentAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_electricity);

        sellElectricityToolbar=findViewById(R.id.sellElecticityToolbar);
        sellElectricityToolbar.setTitle("Tsogatec");
        setSupportActionBar(sellElectricityToolbar);


        meterNumber=findViewById(R.id.sellMeterNo);
        PhoneNo=findViewById(R.id.sellPhoneNo);
        Amount=findViewById(R.id.sellAmount);
        sellWarning=findViewById(R.id.sellWarning);
        currentAccount =findViewById(R.id.selAccBal);

        sellbutton=findViewById(R.id.sellBtn);

        sellbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(meterNumber.getText().toString().equals("")){
                    sellWarning.setText("Enter Meter Number");
                }else if(PhoneNo.getText().toString().equals("")){
                    sellWarning.setText("Enter Phone Number");
                }else if(Amount.getText().toString().equals("")){
                    sellWarning.setText("Enter Amount");
                }
                else{
                    sellToken(v);
                }
            }
        });



    }
    public void sellToken(View view){
        int amount=Integer.parseInt(Amount.getText().toString());
        int currentAcc=Integer.parseInt(currentAccount.getText().toString());

        ViewGroup viewGroup=findViewById(android.R.id.content);

        if(currentAcc<amount){
            dialogView= LayoutInflater.from(this).inflate(R.layout.sell_elec_fail,viewGroup,false);
            Button button=dialogView.findViewById(R.id.selltopUpBtn);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),TopUpAccount.class));
                    finish();
                }
            });


        }else{
           dialogView= LayoutInflater.from(this).inflate(R.layout.sell_elec_success,viewGroup,false);

        }
       AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setView(dialogView);


        AlertDialog alertDialog=builder.create();
        alertDialog.show();


    }
}
