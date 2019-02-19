package org.andestech.learning.rfb19.g3;

public class CreditAccountException extends Exception {

    public int getSummaMin(){
        int SummaMin = this.SummaMin;
        return SummaMin;
    }

    private int SummaMin;
    public CreditAccountException(String message){super(message);}

    public CreditAccountException (String message, int SummaMin){
        this(message);
        this.SummaMin = SummaMin;
    }
}