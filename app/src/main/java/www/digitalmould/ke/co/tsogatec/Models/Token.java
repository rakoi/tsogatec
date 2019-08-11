package www.digitalmould.ke.co.tsogatec.Models;

public class Token {


    public String MeterNo;
    public String Amount;
    public String date;

    public Token() {
    }

    public Token(String meterNo, String amount, String date) {
        MeterNo = meterNo;
        Amount = amount;
        this.date = date;
    }

    public String getMeterNo() {
        return MeterNo;
    }

    public void setMeterNo(String meterNo) {
        MeterNo = meterNo;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
