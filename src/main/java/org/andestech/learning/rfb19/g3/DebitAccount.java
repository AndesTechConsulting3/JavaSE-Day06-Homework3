package org.andestech.learning.rfb19.g3;


public class DebitAccount extends Account {

    @Override
    public void putMoney(int Summ) {

        if (Summ >= PutMin && Summ <= PutMax)this.ballance += Summ;

    }

    @Override
    public void withdrawal(int Summa) {

        if (Summa >= WithdrawMin && Summa <= WithdrawMax)this.ballance -= Summa;
    }


}
