package www.digitalmould.ke.co.tsogatec;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class SellElectricityActivity extends AppCompatActivity {

    public PopupWindow popupWindow;
    public int width,height;
    public boolean focusable=true;
    public View popupView;

    Toolbar sellElectricityToolbar;
    public EditText meterNumber,PhoneNo,Amount;
    public Button sellbutton;
    public TextView sellWarning, currentAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_electricity);

        sellElectricityToolbar=findViewById(R.id.sellElecticityToolbar);
        sellElectricityToolbar.setTitle("Tsogatec");
        setSupportActionBar(sellElectricityToolbar);

        width = LinearLayout.LayoutParams.MATCH_PARENT;
        height = LinearLayout.LayoutParams.MATCH_PARENT ;

        meterNumber=findViewById(R.id.sellMeterNo);
        PhoneNo=findViewById(R.id.sellPhoneNo);
        Amount=findViewById(R.id.sellAmount);
        sellWarning=findViewById(R.id.sellWarning);
        currentAccount =findViewById(R.id.selAccBal);

        sellbutton=findViewById(R.id.sellBtn);

        sellbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(meterNumber.getText().toString().equals("")||PhoneNo.getText().toString().equals("")||Amount.getText().toString().equals("")){
                    sellWarning.setText("Fill in all fields");
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
        Log.d("AMOUNTS", "sellToken: "+amount+currentAcc);
        Drawable d=new ColorDrawable(Color.RED);
        d.setAlpha(130);
        getWindow().setBackgroundDrawable(d);

        if(currentAcc<amount){
            popupView=getLayoutInflater().inflate(R.layout.sell_elec_fail,null);
            Button topUpBtn=popupView.findViewById(R.id.selltopUpBtn);
            topUpBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(getApplicationContext(),TopUpAccount.class));
                }
            });
        }else{
            popupView=getLayoutInflater().inflate(R.layout.sell_elec_success,null);
        }
        popupWindow=new PopupWindow(popupView,width,height,focusable);
        popupWindow.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popupWindow.showAtLocation(view, Gravity.CENTER,0,0);



    }
}
