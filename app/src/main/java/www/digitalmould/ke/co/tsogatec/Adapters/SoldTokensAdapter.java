package www.digitalmould.ke.co.tsogatec.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import www.digitalmould.ke.co.tsogatec.R;
import www.digitalmould.ke.co.tsogatec.Models.Token;

public class SoldTokensAdapter extends RecyclerView.Adapter<SoldTokensAdapter.ViewHolder>{

    public List<Token> tokenList=new ArrayList();


    public SoldTokensAdapter() {
            tokenList.add(new Token("19212109","1200","12/12/2010"));
        tokenList.add(new Token("196012","440","12/12/2010"));
        tokenList.add(new Token("196012","810","12/12/2010"));
        tokenList.add(new Token("196012","1800","12/12/2010"));
        tokenList.add(new Token("196012","1832","12/12/2010"));
        tokenList.add(new Token("196012","1832","12/12/2010"));
        tokenList.add(new Token("196012","1832","12/12/2010"));
        tokenList.add(new Token("196012","440","12/12/2010"));
        tokenList.add(new Token("196012","810","12/12/2010"));
        tokenList.add(new Token("196012","1800","12/12/2010"));

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.soldtokenticket,parent,false);

        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Token token=tokenList.get(position);
        holder.meterNumber.setText(token.getMeterNo());
        holder.amount.setText(token.getAmount());
        holder.date.setText(token.getDate());

    }

    @Override
    public int getItemCount() {
        return tokenList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView meterNumber;
        public TextView amount;
        public TextView date;
        public ViewHolder(View itemView) {
            super(itemView);
            meterNumber=itemView.findViewById(R.id.TokenmeterNumber);
            amount=itemView.findViewById(R.id.TokenAmount);
            date=itemView.findViewById(R.id.Tokendate);


        }
    }

}
