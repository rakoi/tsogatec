package www.digitalmould.ke.co.tsogatec;

import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class TopUpAccount extends AppCompatActivity {
    Toolbar toolbar;
    Button topUpBtn;
    EditText topUpAmount,topUpCode;
    TextView topUpWarning;
    View dialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up_account);
        toolbar=findViewById(R.id.topUpToolbar);
        toolbar.setTitle("Top Up");

        topUpBtn=findViewById(R.id.topupBtn);
        topUpAmount=findViewById(R.id.topupAmount);
        topUpCode=findViewById(R.id.topUpCode);
        topUpWarning=findViewById(R.id.topupwarning);



        topUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(topUpAmount.getText().toString().equals("")){
                    topUpWarning.setText("Enter Amount");
                }else if(topUpCode.getText().toString().equals("")){
                    topUpWarning.setText("Enter Top up code");
                }else {
                    topUpWarning.setText("");
                    checkifisValid(v,topUpCode.getText().toString(),topUpAmount.getText().toString());
                }
            }
        });

    }

    public void checkifisValid(View view,String code,String amount){

        ViewGroup viewGroup=findViewById(android.R.id.content);
         dialogView= LayoutInflater.from(this).inflate(R.layout.top_up_success,viewGroup,false);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setView(dialogView);

        AlertDialog alertDialog=builder.create();
        alertDialog.show();

    }

}
