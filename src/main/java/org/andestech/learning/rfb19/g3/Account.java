package org.andestech.learning.rfb19.g3;

import org.andestech.learning.rfb19.g3.Exceptions.CreditAccountException;
import org.andestech.learning.rfb19.g3.Exceptions.DebitAccountException;

abstract class Account {

public Customer customer;
public int balance;
public String accountId;

    abstract void withDrawal(int deltaBalance) throws DebitAccountException, CreditAccountException;

    abstract void putMoney(int deltaBalance) throws DebitAccountException, CreditAccountException;

}
