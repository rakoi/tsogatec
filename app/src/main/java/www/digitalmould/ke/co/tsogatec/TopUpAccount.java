package www.digitalmould.ke.co.tsogatec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
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
    public PopupWindow popupWindow;
    public View popupView;
    public int width,height;
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

        width= LinearLayout.LayoutParams.MATCH_PARENT;
        height=LinearLayout.LayoutParams.MATCH_PARENT;

        topUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(topUpAmount.getText().toString().equals("")){
                    topUpWarning.setText("Enter Amount");
                }else if(topUpCode.getText().toString().equals("")){
                    topUpWarning.setText("Enter Top up code");
                }else {
                    checkifisValid(v,topUpCode.getText().toString(),topUpAmount.getText().toString());
                }
            }
        });

    }

    public void checkifisValid(View view,String code,String amount){
        popupView=getLayoutInflater().inflate(R.layout.top_up_success,null);
        popupWindow=new PopupWindow(popupView,width,height,true);
        popupWindow.showAtLocation(view, Gravity.CENTER,0,0);

    }

}
