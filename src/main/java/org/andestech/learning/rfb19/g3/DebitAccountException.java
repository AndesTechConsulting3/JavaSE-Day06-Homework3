package org.andestech.learning.rfb19.g3;

public class DebitAccountException extends Exception {

    public int getSummOver(){
        int SummOver = this.SummOver;
        return SummOver;
    }

    private int SummOver;
    public DebitAccountException(String message){super(message);}

    public DebitAccountException (String message, int SummOver){
        this(message);
        this.SummOver = SummOver;
    }
}
