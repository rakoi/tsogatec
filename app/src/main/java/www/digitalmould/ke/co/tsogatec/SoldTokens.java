package www.digitalmould.ke.co.tsogatec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import www.digitalmould.ke.co.tsogatec.Adapters.SoldTokensAdapter;

public class SoldTokens extends AppCompatActivity {

    public Toolbar toolbar;
    public RecyclerView soldTokenRecyclerView;
    public SoldTokensAdapter soldTokensAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sold_tokens);

        toolbar=findViewById(R.id.soldTokensToolbar);
        toolbar.setTitle("Tsogatec");
        setSupportActionBar(toolbar);


        soldTokenRecyclerView=findViewById(R.id.soldTokenRecyclerView);
        soldTokensAdapter=new SoldTokensAdapter();

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());

        soldTokenRecyclerView.setLayoutManager(layoutManager);
        soldTokenRecyclerView.setAdapter(soldTokensAdapter);




    }
}
